#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node *prev;
    struct Node *next;
} Node;

// Create a new node
Node* createNode(int data) {
    Node *newNode = (Node*)malloc(sizeof(Node));
    if (!newNode) {
        printf("Memory allocation failed\n");
        exit(1);
    }
    newNode->data = data;
    newNode->prev = newNode->next = NULL;
    return newNode;
}

// Add at end
void addAtEnd(Node **head, int data) {
    Node *newNode = createNode(data);
    if (*head == NULL) {
        *head = newNode;
        return;
    }
    Node *temp = *head;
    while (temp->next) temp = temp->next;
    temp->next = newNode;
    newNode->prev = temp;
}

// Delete from start
void deleteAtStart(Node **head) {
    if (*head == NULL) {
        printf("List empty\n");
        return;
    }
    Node *temp = *head;
    *head = (*head)->next;
    if (*head) (*head)->prev = NULL;
    free(temp);
}

// Display list
void displayList(Node *head) {
    if (!head) {
        printf("List is empty\n");
        return;
    }
    printf("List: ");
    for (Node *temp = head; temp; temp = temp->next) {
        printf("%d ", temp->data);
    }
    printf("\n");
}

int main() {
    Node *head = NULL;
    int choice, data;

    while (1) {
        printf("\nMenu:\n1. Add at end\n2. Delete from start\n3. Display\n4. Exit\nEnter choice: ");
        fflush(stdout);
        if (scanf("%d", &choice) != 1) break;

        switch (choice) {
            case 1:
                printf("Enter data: ");
                fflush(stdout);
                if (scanf("%d", &data) != 1) break;
                addAtEnd(&head, data);
                break;
            case 2:
                deleteAtStart(&head);
                break;
            case 3:
                displayList(head);
                break;
            case 4:
                // Free all nodes before exit
                while (head) deleteAtStart(&head);
                printf("Exiting\n");
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
    return 0;
}
