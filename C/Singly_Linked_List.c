#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
} Node;

void printList(Node *head)
{
    Node *temp = head;
    printf("Current Linked List: ");
    while (temp)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

void insertAtBeginning(Node **head, int data)
{
    printf("Inserting %d at the beginning...\n", data);
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = *head;
    *head = newNode;
}

void insertAtEnd(Node **head, int data)
{
    printf("Inserting %d at the end...\n", data);
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;
    if (!*head)
    {
        *head = newNode;
        return;
    }
    Node *temp = *head;
    while (temp->next)
        temp = temp->next;
    temp->next = newNode;
}

void insertAtPosition(Node **head, int data, int pos)
{
    printf("Inserting %d at position %d...\n", data, pos);
    if (pos == 0)
    {
        insertAtBeginning(head, data);
        return;
    }
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->data = data;
    Node *temp = *head;
    for (int i = 0; i < pos - 1 && temp; i++)
        temp = temp->next;
    if (!temp)
    {
        printf("Position %d is out of bounds. Insertion failed.\n", pos);
        free(newNode);
        return;
    }
    newNode->next = temp->next;
    temp->next = newNode;
}

void deleteAtBeginning(Node **head)
{
    if (!*head)
    {
        printf("List is empty. Cannot delete from beginning.\n");
        return;
    }
    printf("Deleting node at the beginning (value = %d)...\n", (*head)->data);
    Node *temp = *head;
    *head = (*head)->next;
    free(temp);
}

void deleteAtEnd(Node **head)
{
    if (!*head)
    {
        printf("List is empty. Cannot delete from end.\n");
        return;
    }
    if (!(*head)->next)
    {
        printf("Deleting last node (value = %d)...\n", (*head)->data);
        free(*head);
        *head = NULL;
        return;
    }
    Node *temp = *head;
    while (temp->next->next)
        temp = temp->next;
    printf("Deleting last node (value = %d)...\n", temp->next->data);
    free(temp->next);
    temp->next = NULL;
}

void deleteAtPosition(Node **head, int pos)
{
    if (!*head)
    {
        printf("List is empty. Cannot delete at position %d.\n", pos);
        return;
    }
    if (pos == 0)
    {
        deleteAtBeginning(head);
        return;
    }
    Node *temp = *head;
    for (int i = 0; i < pos - 1 && temp; i++)
        temp = temp->next;
    if (!temp || !temp->next)
    {
        printf("Position %d is out of bounds. Deletion failed.\n", pos);
        return;
    }
    Node *toDelete = temp->next;
    printf("Deleting node at position %d (value = %d)...\n", pos, toDelete->data);
    temp->next = temp->next->next;
    free(toDelete);
}

int main()
{
    Node *head = NULL;

    insertAtEnd(&head, 10);
    printList(head);

    insertAtBeginning(&head, 5);
    printList(head);

    insertAtEnd(&head, 20);
    printList(head);

    insertAtPosition(&head, 15, 2);
    printList(head);

    deleteAtBeginning(&head);
    printList(head);

    deleteAtEnd(&head);
    printList(head);

    deleteAtPosition(&head, 1);
    printList(head);

    // Final cleanup
    while (head)
    {
        deleteAtBeginning(&head);
        printList(head);
    }

    printf("All nodes deleted. Program finished.\n");
    return 0;
}