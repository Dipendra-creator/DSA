#include <iostream>
using namespace std;

/* A binary tree node has data, pointer to left child
and a pointer to right child */
struct Node {
    int data;
    struct Node *left, *right;
    Node(int data)
    {
        this->data = data;
        left = right = NULL;
    }
};

void printPreorder(struct Node*ROOT)
{
    if (ROOT != NULL){
        
        /* first print data of node */
        cout << ROOT->data << " ";
        
        /* then recur on left sutree */
        printPreorder(ROOT->left);
 
        /* now recur on right subtree */
        printPreorder(ROOT->right);
    }
};

int main() {
    struct Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    
    printPreorder(root);
    return 0;
}