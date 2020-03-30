#include<iostream>
#include<vector>
using namespace std;
vector<string> anyjump(int n )
{
    if(n==0)
    {
        vector<string> baseres;
        baseres.push_back("");
        return baseres;

    }
    vector<string> myans;
    for(int i =1;n-i>=0;i++)//or for(int i=1;i<=n;i++)
    {09
        vector<string> recans=anyjump(n-i);
        for(int x =0;x<recans.size();x++)
        {
            myans.push_back(to_string(i)+recans[x]);
        }
    }return myans;
}
int main()
{
    int n=7 ;
    vector<string> ans;
    ans=anyjump(n);
    for(int i =0;i<ans.size();i++)
    {
        cout<<ans[i]<<endl;
    }
}