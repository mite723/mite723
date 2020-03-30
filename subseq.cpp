#include<iostream>
#include<vector>
using namespace std ;
vector<string> subseq1(string que)
{
    if(que.size()==0)
    {
        vector<string> baseres;
        baseres.push_back("");
        return baseres;

    }
    char ch=que[0];
    string roq=que.substr(1);
    vector<string> recans = subseq1(roq);
    vector<string> myans ;
    for(int i =0;i<recans.size();i++)
    {
        myans.push_back(ch+recans[i]);

    }
    for(int i =0;i<recans.size();i++)
    {
        myans.push_back(recans[i]);

    }
return myans;
}

int main()
{
    vector<string> arr;
    string que="abc";
   arr= subseq1(que);
    for(int i =0;i<arr.size();i++)
    {
        cout<<arr[i]<<endl;
    }
}