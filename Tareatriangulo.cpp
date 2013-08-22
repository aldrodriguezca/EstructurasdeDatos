#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{
     int n;
     int a,b=1;
     cout<<"Por favor digite la cantidad de filas que desea que tenga el triangulo"<<endl;
     cin>>n;
     a=n-1;
      for (int i=1;i<=n;i++){
        for (int w=a;w>=0;w--)
        {
            cout<<" ";
        }
        for (int j=1;j<=b;j++) {          
                                cout<<"*";
                               }
           cout<<endl;
           b+=2;
           a-=1;
        }
    system("PAUSE");
    return EXIT_SUCCESS;
}
