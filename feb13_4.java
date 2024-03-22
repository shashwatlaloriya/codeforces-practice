#include <bits/stdc++.h>

        using namespace std;

        #define int long long

        signed main()
        {
            int t;
        cin >> t;
         while (t--)
         {
         int n, x, y;
         cin >> n >> x >> y;
        int arr[n];
         for (int i = 0; i < n; i++)
        { cin >> arr[i];
         }
        map<pair<int, int>, int> mp;
        int ans=0;
        for (int i = 0; i < n; i++)
        {
        int p=arr[i]%x;
         int q=arr[i]%y;
        ans+=mp[{x-p,q}];

        if(p==0) {
        p=x;
        }
         mp[{p,q}]++;

        }
        cout<<ans<<endl;
         }
        }