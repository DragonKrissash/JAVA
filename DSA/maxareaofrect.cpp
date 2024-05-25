#include <bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;cin>>n;
    int arr[n];
    for(int a=0;a<n;a++){
        cin>>arr[a];
    }
    stack<int>st;
    stack<int>st2;
    vector<int>premin(n,-1);
    for(int a=0;a<n;a++){
        if(st.empty())
        st.push(a);
        else{
            if(arr[st.top()]<arr[a])
            {premin[a]=st.top();
             st.push(a);
            }
            else{
                st2=st;
                while(!st.empty()&& arr[st.top()]>=arr[a])st.pop();
                if(!st.empty())
                premin[a]=st.top();
                else premin[a]=-1;
                st2.push(a);
                st=st2;
            }
        }
    }
    vector<int>nextmin(n,n);
    while(!st.empty())st.pop();
    for(int a=n-1;a>=0;a--){
        if(st.empty())
        st.push(a);
        else{
            if(arr[st.top()]<arr[a])
            {nextmin[a]=st.top();
             st.push(a);
            }
            else{
                st2=st;
                while(!st.empty()&& arr[st.top()]>=arr[a])st.pop();
                if(!st.empty())
                nextmin[a]=st.top();
                else nextmin[a]=n;
                st2.push(a);
                st=st2;
            }
        }
    }
    int max=0;
    for(int a=0;a<n;a++)
    {int area=nextmin[a]-premin[a]-1;
    area=area*arr[a];
    if(area>max)max=area;
    }
    cout<<max;

}