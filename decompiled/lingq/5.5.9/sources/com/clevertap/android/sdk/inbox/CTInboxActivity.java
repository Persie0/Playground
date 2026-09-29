package com.clevertap.android.sdk.inbox;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0949e0;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.C2182b;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.google.android.exoplayer2.C2413j;
import com.google.android.material.tabs.TabLayout;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p003a2.C0009a;
import p254m2.C7472a;
import p286o2.C7906f;
import p290o6.C7966l;
import p290o6.InterfaceC7953e0;
import p316p6.C8192a;
import p408u6.C9471j;
import p408u6.C9472k;
import p408u6.C9473l;

/* JADX INFO: loaded from: classes.dex */
public class CTInboxActivity extends ActivityC0979t implements C2246a.b, InterfaceC7953e0 {

    /* JADX INFO: renamed from: b0 */
    public static int f11259b0;

    /* JADX INFO: renamed from: S */
    public C9472k f11260S;

    /* JADX INFO: renamed from: T */
    public CTInboxStyleConfig f11261T;

    /* JADX INFO: renamed from: U */
    public TabLayout f11262U;

    /* JADX INFO: renamed from: V */
    public ViewPager f11263V;

    /* JADX INFO: renamed from: W */
    public CleverTapInstanceConfig f11264W;

    /* JADX INFO: renamed from: X */
    public WeakReference<InterfaceC2243c> f11265X;

    /* JADX INFO: renamed from: Y */
    public CleverTapAPI f11266Y;

    /* JADX INFO: renamed from: Z */
    public C2182b f11267Z;

    /* JADX INFO: renamed from: a0 */
    public WeakReference<InAppNotificationActivity.InterfaceC2180e> f11268a0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxActivity$a */
    public class ViewOnClickListenerC2241a implements View.OnClickListener {
        public ViewOnClickListenerC2241a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CTInboxActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxActivity$b */
    public class C2242b implements TabLayout.InterfaceC3073d {
        public C2242b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: a */
        public final void mo6541a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: b */
        public final void mo6542b(TabLayout.C3076g c3076g) {
            C9472k c9472k = CTInboxActivity.this.f11260S;
            C8192a c8192a = ((C2246a) c9472k.f48562h[c3076g.f15668d]).f11311z0;
            if (c8192a != null && c8192a.f44369h1 == null) {
                c8192a.m16315p0(c8192a.f44367f1);
                c8192a.m16316q0();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: c */
        public final void mo6543c(TabLayout.C3076g c3076g) {
            C2413j c2413j;
            C8192a c8192a = ((C2246a) CTInboxActivity.this.f11260S.f48562h[c3076g.f15668d]).f11311z0;
            if (c8192a == null || (c2413j = c8192a.f44366e1) == null) {
                return;
            }
            c2413j.setPlayWhenReady(false);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxActivity$c */
    public interface InterfaceC2243c {
        /* JADX INFO: renamed from: a */
        void mo6426a(CTInboxMessage cTInboxMessage);

        /* JADX INFO: renamed from: b */
        void mo6427b(CTInboxMessage cTInboxMessage, Bundle bundle, HashMap map);
    }

    @Override // p290o6.InterfaceC7953e0
    /* JADX INFO: renamed from: F */
    public final void mo6437F(boolean z10) {
        this.f11267Z.m6463a(z10, this.f11268a0.get());
    }

    @Override // com.clevertap.android.sdk.inbox.C2246a.b
    /* JADX INFO: renamed from: a */
    public final void mo6539a(CTInboxMessage cTInboxMessage) {
        InterfaceC2243c interfaceC2243c;
        C2181a.m6455h("CTInboxActivity:messageDidShow() called with: data = [null], inboxMessage = [" + cTInboxMessage.f11287l + "]");
        C2181a.m6455h("CTInboxActivity:didShow() called with: data = [null], inboxMessage = [" + cTInboxMessage.f11287l + "]");
        try {
            interfaceC2243c = this.f11265X.get();
        } catch (Throwable unused) {
            interfaceC2243c = null;
        }
        if (interfaceC2243c == null) {
            C2181a c2181aM6433b = this.f11264W.m6433b();
            String str = this.f11264W.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6460m(str, "InboxActivityListener is null for notification inbox ");
        }
        if (interfaceC2243c != null) {
            interfaceC2243c.mo6426a(cTInboxMessage);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int size;
        ArrayList<C9473l> arrayList;
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalArgumentException();
            }
            this.f11261T = (CTInboxStyleConfig) extras.getParcelable("styleConfig");
            Bundle bundle2 = extras.getBundle("configBundle");
            if (bundle2 != null) {
                this.f11264W = (CleverTapInstanceConfig) bundle2.getParcelable("config");
            }
            CleverTapAPI cleverTapAPIM6423j = CleverTapAPI.m6423j(getApplicationContext(), this.f11264W, null);
            this.f11266Y = cleverTapAPIM6423j;
            if (cleverTapAPIM6423j != null) {
                this.f11265X = new WeakReference<>(cleverTapAPIM6423j);
                this.f11268a0 = new WeakReference<>(CleverTapAPI.m6423j(this, this.f11264W, null).f10981b.f43478h);
                this.f11267Z = new C2182b(this, this.f11264W);
            }
            f11259b0 = getResources().getConfiguration().orientation;
            setContentView(R.layout.inbox_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(this.f11261T.f10969e);
            toolbar.setTitleTextColor(Color.parseColor(this.f11261T.f10970f));
            toolbar.setBackgroundColor(Color.parseColor(this.f11261T.f10968d));
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
            Drawable drawableM15676a = C7906f.a.m15676a(resources, R.drawable.ct_ic_arrow_back_white_24dp, null);
            if (drawableM15676a != null) {
                drawableM15676a.setColorFilter(Color.parseColor(this.f11261T.f10965a), PorterDuff.Mode.SRC_IN);
            }
            toolbar.setNavigationIcon(drawableM15676a);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2241a());
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.inbox_linear_layout);
            linearLayout.setBackgroundColor(Color.parseColor(this.f11261T.f10967c));
            this.f11262U = (TabLayout) linearLayout.findViewById(R.id.tab_layout);
            this.f11263V = (ViewPager) linearLayout.findViewById(R.id.view_pager);
            TextView textView = (TextView) findViewById(R.id.no_message_view);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("config", this.f11264W);
            bundle3.putParcelable("styleConfig", this.f11261T);
            String[] strArr = this.f11261T.f10976l;
            int i10 = 0;
            if (strArr != null && strArr.length > 0) {
                this.f11263V.setVisibility(0);
                String[] strArr2 = this.f11261T.f10976l;
                ArrayList arrayList2 = strArr2 == null ? new ArrayList() : new ArrayList(Arrays.asList(strArr2));
                this.f11260S = new C9472k(m3805K(), arrayList2.size() + 1);
                this.f11262U.setVisibility(0);
                this.f11262U.setTabGravity(0);
                this.f11262U.setTabMode(1);
                this.f11262U.setSelectedTabIndicatorColor(Color.parseColor(this.f11261T.f10974j));
                TabLayout tabLayout = this.f11262U;
                int color = Color.parseColor(this.f11261T.f10964H);
                int color2 = Color.parseColor(this.f11261T.f10973i);
                tabLayout.getClass();
                tabLayout.setTabTextColors(TabLayout.m8851g(color, color2));
                this.f11262U.setBackgroundColor(Color.parseColor(this.f11261T.f10975k));
                Bundle bundle4 = (Bundle) bundle3.clone();
                bundle4.putInt("position", 0);
                C2246a c2246a = new C2246a();
                c2246a.m3583e0(bundle4);
                C9472k c9472k = this.f11260S;
                String str = this.f11261T.f10966b;
                c9472k.f48562h[0] = c2246a;
                c9472k.f48563i.add(str);
                while (i10 < arrayList2.size()) {
                    String str2 = (String) arrayList2.get(i10);
                    i10++;
                    Bundle bundle5 = (Bundle) bundle3.clone();
                    bundle5.putInt("position", i10);
                    bundle5.putString("filter", str2);
                    C2246a c2246a2 = new C2246a();
                    c2246a2.m3583e0(bundle5);
                    C9472k c9472k2 = this.f11260S;
                    c9472k2.f48562h[i10] = c2246a2;
                    c9472k2.f48563i.add(str2);
                    this.f11263V.setOffscreenPageLimit(i10);
                }
                this.f11263V.setAdapter(this.f11260S);
                C9472k c9472k3 = this.f11260S;
                synchronized (c9472k3) {
                    DataSetObserver dataSetObserver = c9472k3.f51778b;
                    if (dataSetObserver != null) {
                        dataSetObserver.onChanged();
                    }
                }
                c9472k3.f51777a.notifyChanged();
                this.f11263V.m4642b(new TabLayout.C3077h(this.f11262U));
                this.f11262U.m8852a(new C2242b());
                this.f11262U.setupWithViewPager(this.f11263V);
            } else {
                this.f11263V.setVisibility(8);
                this.f11262U.setVisibility(8);
                ((FrameLayout) findViewById(R.id.list_view_fragment)).setVisibility(0);
                CleverTapAPI cleverTapAPI = this.f11266Y;
                if (cleverTapAPI != null) {
                    synchronized (cleverTapAPI.f10981b.f43475e.f43257b) {
                        try {
                            C9471j c9471j = cleverTapAPI.f10981b.f43477g.f43436e;
                            if (c9471j != null) {
                                synchronized (c9471j.f48554c) {
                                    c9471j.m17888d();
                                    arrayList = c9471j.f48553b;
                                }
                                size = arrayList.size();
                            } else {
                                C2181a c2181aM6429f = cleverTapAPI.m6429f();
                                String strM6428e = cleverTapAPI.m6428e();
                                c2181aM6429f.getClass();
                                C2181a.m6452d(strM6428e, "Notification Inbox not initialized");
                                size = -1;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (size == 0) {
                        textView.setBackgroundColor(Color.parseColor(this.f11261T.f10967c));
                        textView.setVisibility(0);
                        textView.setText(this.f11261T.f10971g);
                        textView.setTextColor(Color.parseColor(this.f11261T.f10972h));
                        return;
                    }
                }
                textView.setVisibility(8);
                Iterator<Fragment> it = m3805K().m3620H().iterator();
                while (it.hasNext()) {
                    String str3 = it.next().f6083U;
                    if (str3 != null) {
                        if (!str3.equalsIgnoreCase(this.f11264W.f10995a + ":CT_INBOX_LIST_VIEW_FRAGMENT")) {
                            i10 = 1;
                        }
                    }
                }
                if (i10 == 0) {
                    C2246a c2246a3 = new C2246a();
                    c2246a3.m3583e0(bundle3);
                    C0949e0 c0949e0M3805K = m3805K();
                    c0949e0M3805K.getClass();
                    C0940a c0940a = new C0940a(c0949e0M3805K);
                    c0940a.mo3695f(R.id.list_view_fragment, c2246a3, C0009a.m23l(new StringBuilder(), this.f11264W.f10995a, ":CT_INBOX_LIST_VIEW_FRAGMENT"), 1);
                    c0940a.m3697i();
                }
            }
        } catch (Throwable th3) {
            C2181a.m6457j("Cannot find a valid notification inbox bundle to show!", th3);
        }
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onDestroy() {
        String[] strArr = this.f11261T.f10976l;
        if (strArr != null && strArr.length > 0) {
            for (Fragment fragment : m3805K().m3620H()) {
                if (fragment instanceof C2246a) {
                    C2181a.m6455h("Removing fragment - " + fragment.toString());
                    m3805K().m3620H().remove(fragment);
                }
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        C7966l.m15803a(this, this.f11264W);
        boolean z10 = false;
        C7966l.f43364c = false;
        C7966l.m15804b(this, this.f11264W);
        if (i10 == 102) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            }
            if (z10) {
                this.f11268a0.get().mo6448d();
                return;
            }
            this.f11268a0.get().mo6447b();
        }
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f11267Z.f11021d || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (C7472a.m14841a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.f11268a0.get().mo6448d();
        } else {
            this.f11268a0.get().mo6447b();
        }
    }

    @Override // com.clevertap.android.sdk.inbox.C2246a.b
    /* JADX INFO: renamed from: r */
    public final void mo6540r(CTInboxMessage cTInboxMessage, Bundle bundle, HashMap map, boolean z10) {
        InterfaceC2243c interfaceC2243c;
        try {
            interfaceC2243c = this.f11265X.get();
        } catch (Throwable unused) {
            interfaceC2243c = null;
        }
        if (interfaceC2243c == null) {
            C2181a c2181aM6433b = this.f11264W.m6433b();
            String str = this.f11264W.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6460m(str, "InboxActivityListener is null for notification inbox ");
        }
        if (interfaceC2243c != null) {
            interfaceC2243c.mo6427b(cTInboxMessage, bundle, map);
        }
    }
}
