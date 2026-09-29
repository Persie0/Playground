package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0140a;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0195n;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0182a;
import androidx.activity.InterfaceC0209s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0207f;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0204c;
import androidx.activity.result.C0206e;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0202a;
import androidx.activity.result.InterfaceC0208g;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.p544savedstate.C1189a;
import androidx.view.C1042k0;
import androidx.view.InterfaceC1048n0;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.kochava.tracker.BuildConfig;
import com.linguist.R;
import dm.C5207g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p003a2.C0009a;
import p035c.AbstractC1641a;
import p035c.C1642b;
import p035c.C1644d;
import p232l2.C7231j;
import p232l2.InterfaceC7240s;
import p232l2.InterfaceC7241t;
import p254m2.InterfaceC7473b;
import p254m2.InterfaceC7474c;
import p270n4.InterfaceC7706c;
import p402u0.C9371n;
import p446w2.InterfaceC9803a;
import p471x2.InterfaceC10042i;
import p471x2.InterfaceC10048l;
import p529z9.InterfaceC10461a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: A */
    public C0206e f6144A;

    /* JADX INFO: renamed from: B */
    public C0206e f6145B;

    /* JADX INFO: renamed from: C */
    public C0206e f6146C;

    /* JADX INFO: renamed from: E */
    public boolean f6148E;

    /* JADX INFO: renamed from: F */
    public boolean f6149F;

    /* JADX INFO: renamed from: G */
    public boolean f6150G;

    /* JADX INFO: renamed from: H */
    public boolean f6151H;

    /* JADX INFO: renamed from: I */
    public boolean f6152I;

    /* JADX INFO: renamed from: J */
    public ArrayList<C0940a> f6153J;

    /* JADX INFO: renamed from: K */
    public ArrayList<Boolean> f6154K;

    /* JADX INFO: renamed from: L */
    public ArrayList<Fragment> f6155L;

    /* JADX INFO: renamed from: M */
    public C0951f0 f6156M;

    /* JADX INFO: renamed from: b */
    public boolean f6159b;

    /* JADX INFO: renamed from: d */
    public ArrayList<C0940a> f6161d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Fragment> f6162e;

    /* JADX INFO: renamed from: g */
    public OnBackPressedDispatcher f6164g;

    /* JADX INFO: renamed from: o */
    public final C0974r f6172o;

    /* JADX INFO: renamed from: r */
    public final C0972q f6175r;

    /* JADX INFO: renamed from: u */
    public AbstractC0986x<?> f6178u;

    /* JADX INFO: renamed from: v */
    public AbstractC0140a f6179v;

    /* JADX INFO: renamed from: w */
    public Fragment f6180w;

    /* JADX INFO: renamed from: x */
    public Fragment f6181x;

    /* JADX INFO: renamed from: a */
    public final ArrayList<InterfaceC0929n> f6158a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C0961k0 f6160c = new C0961k0();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0988z f6163f = new LayoutInflaterFactory2C0988z(this);

    /* JADX INFO: renamed from: h */
    public final C0917b f6165h = new C0917b();

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f6166i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map<String, BackStackState> f6167j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map<String, Bundle> f6168k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l */
    public final Map<String, C0928m> f6169l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final C0941a0 f6170m = new C0941a0(this);

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList<InterfaceC0953g0> f6171n = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: p */
    public final C0943b0 f6173p = new InterfaceC9803a() { // from class: androidx.fragment.app.b0
        @Override // p446w2.InterfaceC9803a
        /* JADX INFO: renamed from: a */
        public final void mo3724a(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = this.f6267a;
            if (fragmentManager.m3623M() && num.intValue() == 80) {
                fragmentManager.m3655l(false);
            }
        }
    };

    /* JADX INFO: renamed from: q */
    public final C0945c0 f6174q = new InterfaceC9803a() { // from class: androidx.fragment.app.c0
        @Override // p446w2.InterfaceC9803a
        /* JADX INFO: renamed from: a */
        public final void mo3724a(Object obj) {
            C7231j c7231j = (C7231j) obj;
            FragmentManager fragmentManager = this.f6271a;
            if (fragmentManager.m3623M()) {
                fragmentManager.m3656m(c7231j.f40625a, false);
            }
        }
    };

    /* JADX INFO: renamed from: s */
    public final C0918c f6176s = new C0918c();

    /* JADX INFO: renamed from: t */
    public int f6177t = -1;

    /* JADX INFO: renamed from: y */
    public final C0919d f6182y = new C0919d();

    /* JADX INFO: renamed from: z */
    public final C0920e f6183z = new C0920e();

    /* JADX INFO: renamed from: D */
    public ArrayDeque<LaunchedFragmentInfo> f6147D = new ArrayDeque<>();

    /* JADX INFO: renamed from: N */
    public final RunnableC0921f f6157N = new RunnableC0921f();

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0915a();

        /* JADX INFO: renamed from: a */
        public final String f6188a;

        /* JADX INFO: renamed from: b */
        public final int f6189b;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C0915a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f6188a = parcel.readString();
            this.f6189b = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i10) {
            this.f6188a = str;
            this.f6189b = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f6188a);
            parcel.writeInt(this.f6189b);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$a */
    public class C0916a implements InterfaceC0202a<Map<String, Boolean>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FragmentManager f6190a;

        public C0916a(C0949e0 c0949e0) {
            this.f6190a = c0949e0;
        }

        @Override // androidx.activity.result.InterfaceC0202a
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: a */
        public final void mo843a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = this.f6190a;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f6147D.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
            } else {
                C0961k0 c0961k0 = fragmentManager.f6160c;
                String str = launchedFragmentInfoPollFirst.f6188a;
                if (c0961k0.m3759c(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$b */
    public class C0917b extends AbstractC0195n {
        public C0917b() {
            super(false);
        }

        @Override // androidx.activity.AbstractC0195n
        /* JADX INFO: renamed from: a */
        public final void mo823a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.m3667x(true);
            if (fragmentManager.f6165h.f500a) {
                fragmentManager.m3629U();
            } else {
                fragmentManager.f6164g.m805b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$c */
    public class C0918c implements InterfaceC10048l {
        public C0918c() {
        }

        @Override // p471x2.InterfaceC10048l
        /* JADX INFO: renamed from: a */
        public final boolean mo3670a(MenuItem menuItem) {
            return FragmentManager.this.m3658o();
        }

        @Override // p471x2.InterfaceC10048l
        /* JADX INFO: renamed from: b */
        public final void mo3671b(Menu menu) {
            FragmentManager.this.m3659p();
        }

        @Override // p471x2.InterfaceC10048l
        /* JADX INFO: renamed from: c */
        public final void mo3672c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.m3652j();
        }

        @Override // p471x2.InterfaceC10048l
        /* JADX INFO: renamed from: d */
        public final void mo3673d(Menu menu) {
            FragmentManager.this.m3662s();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$d */
    public class C0919d extends C0985w {
        public C0919d() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.fragment.app.C0985w
        /* JADX INFO: renamed from: a */
        public final Fragment mo3674a(String str) {
            Context context = FragmentManager.this.f6178u.f6429b;
            Object obj = Fragment.f6069u0;
            try {
                return C0985w.m3818c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new Fragment.InstantiationException(C0141b.m611g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (InstantiationException e11) {
                throw new Fragment.InstantiationException(C0141b.m611g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new Fragment.InstantiationException(C0141b.m611g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new Fragment.InstantiationException(C0141b.m611g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$e */
    public class C0920e implements InterfaceC0984v0 {
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$f */
    public class RunnableC0921f implements Runnable {
        public RunnableC0921f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.m3667x(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$g */
    public class C0922g implements InterfaceC0953g0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f6195a;

        public C0922g(Fragment fragment) {
            this.f6195a = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC0953g0
        /* JADX INFO: renamed from: c */
        public final void mo3675c(FragmentManager fragmentManager, Fragment fragment) {
            this.f6195a.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$h */
    public class C0923h implements InterfaceC0202a<ActivityResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FragmentManager f6196a;

        public C0923h(C0949e0 c0949e0) {
            this.f6196a = c0949e0;
        }

        @Override // androidx.activity.result.InterfaceC0202a
        /* JADX INFO: renamed from: a */
        public final void mo843a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = this.f6196a;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f6147D.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            C0961k0 c0961k0 = fragmentManager.f6160c;
            String str = launchedFragmentInfoPollFirst.f6188a;
            Fragment fragmentM3759c = c0961k0.m3759c(str);
            if (fragmentM3759c != null) {
                fragmentM3759c.mo3559D(launchedFragmentInfoPollFirst.f6189b, activityResult2.f505a, activityResult2.f506b);
            } else {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$i */
    public class C0924i implements InterfaceC0202a<ActivityResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FragmentManager f6197a;

        public C0924i(C0949e0 c0949e0) {
            this.f6197a = c0949e0;
        }

        @Override // androidx.activity.result.InterfaceC0202a
        /* JADX INFO: renamed from: a */
        public final void mo843a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = this.f6197a;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f6147D.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            C0961k0 c0961k0 = fragmentManager.f6160c;
            String str = launchedFragmentInfoPollFirst.f6188a;
            Fragment fragmentM3759c = c0961k0.m3759c(str);
            if (fragmentM3759c != null) {
                fragmentM3759c.mo3559D(launchedFragmentInfoPollFirst.f6189b, activityResult2.f505a, activityResult2.f506b);
            } else {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$j */
    public interface InterfaceC0925j {
        /* JADX INFO: renamed from: a */
        String mo3676a();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$k */
    public static class C0926k extends AbstractC1641a<IntentSenderRequest, ActivityResult> {
        @Override // p035c.AbstractC1641a
        /* JADX INFO: renamed from: a */
        public final Intent mo3677a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.f512b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = intentSenderRequest.f511a;
                    C5207g.m11111f(intentSender, "intentSender");
                    intentSenderRequest = new IntentSenderRequest(intentSender, null, intentSenderRequest.f513c, intentSenderRequest.f514d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m3608K(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p035c.AbstractC1641a
        /* JADX INFO: renamed from: c */
        public final Object mo3678c(Intent intent, int i10) {
            return new ActivityResult(intent, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$l */
    public static abstract class AbstractC0927l {
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$m */
    public static class C0928m implements InterfaceC0957i0 {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f6198a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0957i0 f6199b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1049o f6200c;

        public C0928m(Lifecycle lifecycle, C9371n c9371n, InterfaceC1049o interfaceC1049o) {
            this.f6198a = lifecycle;
            this.f6199b = c9371n;
            this.f6200c = interfaceC1049o;
        }

        @Override // androidx.fragment.app.InterfaceC0957i0
        /* JADX INFO: renamed from: b */
        public final void mo3679b(Bundle bundle, String str) {
            this.f6199b.mo3679b(bundle, str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$n */
    public interface InterfaceC0929n {
        /* JADX INFO: renamed from: b */
        boolean mo3680b(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$o */
    public class C0930o implements InterfaceC0929n {

        /* JADX INFO: renamed from: a */
        public final String f6201a;

        /* JADX INFO: renamed from: b */
        public final int f6202b;

        /* JADX INFO: renamed from: c */
        public final int f6203c;

        public C0930o(String str, int i10, int i11) {
            this.f6201a = str;
            this.f6202b = i10;
            this.f6203c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0929n
        /* JADX INFO: renamed from: b */
        public final boolean mo3680b(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f6181x;
            if (fragment == null || this.f6202b >= 0 || this.f6201a != null || !fragment.m3594l().m3629U()) {
                return FragmentManager.this.m3631W(arrayList, arrayList2, this.f6201a, this.f6202b, this.f6203c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$p */
    public class C0931p implements InterfaceC0929n {

        /* JADX INFO: renamed from: a */
        public final String f6205a;

        public C0931p(String str) {
            this.f6205a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0929n
        /* JADX INFO: renamed from: b */
        public final boolean mo3680b(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            BackStackState backStackStateRemove = fragmentManager.f6167j.remove(this.f6205a);
            boolean z10 = false;
            if (backStackStateRemove != null) {
                HashMap map = new HashMap();
                for (C0940a c0940a : arrayList) {
                    if (c0940a.f6253t) {
                        Iterator<AbstractC0963l0.a> it = c0940a.f6344a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment = it.next().f6361b;
                            if (fragment != null) {
                                map.put(fragment.f6099f, fragment);
                            }
                        }
                    }
                }
                List<String> list = backStackStateRemove.f6067a;
                HashMap map2 = new HashMap(list.size());
                Iterator<String> it2 = list.iterator();
                loop2: while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop2;
                        }
                        String next = it2.next();
                        Fragment fragment2 = (Fragment) map.get(next);
                        if (fragment2 != null) {
                            map2.put(fragment2.f6099f, fragment2);
                        } else {
                            FragmentState fragmentStateM3765i = fragmentManager.f6160c.m3765i(next, null);
                            if (fragmentStateM3765i != null) {
                                Fragment fragmentM3681a = fragmentStateM3765i.m3681a(fragmentManager.m3619G(), fragmentManager.f6178u.f6429b.getClassLoader());
                                map2.put(fragmentM3681a.f6099f, fragmentM3681a);
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (BackStackRecordState backStackRecordState : backStackStateRemove.f6068b) {
                    backStackRecordState.getClass();
                    C0940a c0940a2 = new C0940a(fragmentManager);
                    backStackRecordState.m3555a(c0940a2);
                    int i10 = 0;
                    while (true) {
                        ArrayList<String> arrayList4 = backStackRecordState.f6056b;
                        if (i10 < arrayList4.size()) {
                            String str = arrayList4.get(i10);
                            if (str != null) {
                                Fragment fragment3 = (Fragment) map2.get(str);
                                if (fragment3 == null) {
                                    throw new IllegalStateException("Restoring FragmentTransaction " + backStackRecordState.f6060f + " failed due to missing saved state for Fragment (" + str + ")");
                                }
                                c0940a2.f6344a.get(i10).f6361b = fragment3;
                            }
                            i10++;
                        }
                    }
                    arrayList3.add(c0940a2);
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((C0940a) it3.next()).mo3680b(arrayList, arrayList2);
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$q */
    public class C0932q implements InterfaceC0929n {

        /* JADX INFO: renamed from: a */
        public final String f6207a;

        public C0932q(String str) {
            this.f6207a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0929n
        /* JADX INFO: renamed from: b */
        public final boolean mo3680b(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2) {
            int i10;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f6207a;
            int iM3614B = fragmentManager.m3614B(str, -1, true);
            if (iM3614B < 0) {
                return false;
            }
            for (int i11 = iM3614B; i11 < fragmentManager.f6161d.size(); i11++) {
                C0940a c0940a = fragmentManager.f6161d.get(i11);
                if (!c0940a.f6359p) {
                    fragmentManager.m3651i0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0940a + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            int i12 = iM3614B;
            while (true) {
                int i13 = 2;
                if (i12 >= fragmentManager.f6161d.size()) {
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment = (Fragment) arrayDeque.removeFirst();
                        if (fragment.f6086X) {
                            StringBuilder sbM854m = C0204c.m854m("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            sbM854m.append(hashSet.contains(fragment) ? "direct reference to retained " : "retained child ");
                            sbM854m.append("fragment ");
                            sbM854m.append(fragment);
                            fragmentManager.m3651i0(new IllegalArgumentException(sbM854m.toString()));
                            throw null;
                        }
                        for (Fragment fragment2 : fragment.f6079Q.f6160c.m3761e()) {
                            if (fragment2 != null) {
                                arrayDeque.addLast(fragment2);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((Fragment) it.next()).f6099f);
                    }
                    ArrayList arrayList4 = new ArrayList(fragmentManager.f6161d.size() - iM3614B);
                    for (int i14 = iM3614B; i14 < fragmentManager.f6161d.size(); i14++) {
                        arrayList4.add(null);
                    }
                    BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                    for (int size = fragmentManager.f6161d.size() - 1; size >= iM3614B; size--) {
                        C0940a c0940aRemove = fragmentManager.f6161d.remove(size);
                        C0940a c0940a2 = new C0940a(c0940aRemove);
                        ArrayList<AbstractC0963l0.a> arrayList5 = c0940a2.f6344a;
                        int size2 = arrayList5.size();
                        while (true) {
                            size2--;
                            if (size2 >= 0) {
                                AbstractC0963l0.a aVar = arrayList5.get(size2);
                                if (aVar.f6362c) {
                                    if (aVar.f6360a == 8) {
                                        aVar.f6362c = false;
                                        size2--;
                                        arrayList5.remove(size2);
                                    } else {
                                        int i15 = aVar.f6361b.f6082T;
                                        aVar.f6360a = 2;
                                        aVar.f6362c = false;
                                        for (int i16 = size2 - 1; i16 >= 0; i16--) {
                                            AbstractC0963l0.a aVar2 = arrayList5.get(i16);
                                            if (aVar2.f6362c && aVar2.f6361b.f6082T == i15) {
                                                arrayList5.remove(i16);
                                                size2--;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        arrayList4.set(size - iM3614B, new BackStackRecordState(c0940a2));
                        c0940aRemove.f6253t = true;
                        arrayList.add(c0940aRemove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    fragmentManager.f6167j.put(str, backStackState);
                    return true;
                }
                C0940a c0940a3 = fragmentManager.f6161d.get(i12);
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                for (AbstractC0963l0.a aVar3 : c0940a3.f6344a) {
                    Fragment fragment3 = aVar3.f6361b;
                    if (fragment3 != null) {
                        if (!aVar3.f6362c || (i10 = aVar3.f6360a) == 1 || i10 == i13 || i10 == 8) {
                            hashSet.add(fragment3);
                            hashSet2.add(fragment3);
                        }
                        int i17 = aVar3.f6360a;
                        if (i17 == 1 || i17 == 2) {
                            hashSet3.add(fragment3);
                        }
                        i13 = 2;
                    }
                }
                hashSet2.removeAll(hashSet3);
                if (!hashSet2.isEmpty()) {
                    StringBuilder sbM854m2 = C0204c.m854m("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                    sbM854m2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                    sbM854m2.append(" in ");
                    sbM854m2.append(c0940a3);
                    sbM854m2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                    fragmentManager.m3651i0(new IllegalArgumentException(sbM854m2.toString()));
                    throw null;
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.b0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.c0] */
    public FragmentManager() {
        int i10 = 1;
        this.f6172o = new C0974r(i10, this);
        this.f6175r = new C0972q(i10, this);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m3608K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    /* JADX INFO: renamed from: L */
    public static boolean m3609L(Fragment fragment) {
        boolean z10 = false;
        boolean zM3609L = false;
        for (Fragment fragment2 : fragment.f6079Q.f6160c.m3761e()) {
            if (fragment2 != null) {
                zM3609L = m3609L(fragment2);
            }
            if (zM3609L) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (m3610N(r6.f6080R) != false) goto L15;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m3610N(Fragment fragment) {
        boolean z10 = true;
        if (fragment == null) {
            return true;
        }
        if (!fragment.f6088Z) {
            z10 = false;
        } else if (fragment.f6077O == null) {
        }
        return z10;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m3611O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f6077O;
        return fragment.equals(fragmentManager.f6181x) && m3611O(fragmentManager.f6180w);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m3612g0(Fragment fragment) {
        if (m3608K(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f6084V) {
            fragment.f6084V = false;
            fragment.f6102g0 = !fragment.f6102g0;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Fragment m3613A(String str) {
        return this.f6160c.m3758b(str);
    }

    /* JADX INFO: renamed from: B */
    public final int m3614B(String str, int i10, boolean z10) {
        ArrayList<C0940a> arrayList = this.f6161d;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (str == null && i10 < 0) {
                if (z10) {
                    return 0;
                }
                return this.f6161d.size() - 1;
            }
            int size = this.f6161d.size() - 1;
            while (size >= 0) {
                C0940a c0940a = this.f6161d.get(size);
                if ((str != null && str.equals(c0940a.f6352i)) || (i10 >= 0 && i10 == c0940a.f6252s)) {
                    break;
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z10) {
                while (size > 0) {
                    C0940a c0940a2 = this.f6161d.get(size - 1);
                    if (str == null || !str.equals(c0940a2.f6352i)) {
                        if (i10 < 0 || i10 != c0940a2.f6252s) {
                            break;
                        }
                    }
                    size--;
                }
            } else {
                if (size == this.f6161d.size() - 1) {
                    return -1;
                }
                size++;
            }
            return size;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public final Fragment m3615C(int i10) {
        C0961k0 c0961k0 = this.f6160c;
        ArrayList<Fragment> arrayList = c0961k0.f6318a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (C0959j0 c0959j0 : c0961k0.f6319b.values()) {
                    if (c0959j0 != null) {
                        Fragment fragment = c0959j0.f6311c;
                        if (fragment.f6081S == i10) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = arrayList.get(size);
            if (fragment2 != null && fragment2.f6081S == i10) {
                return fragment2;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final Fragment m3616D(String str) {
        C0961k0 c0961k0 = this.f6160c;
        if (str != null) {
            ArrayList<Fragment> arrayList = c0961k0.f6318a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.f6083U)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0959j0 c0959j0 : c0961k0.f6319b.values()) {
                if (c0959j0 != null) {
                    Fragment fragment2 = c0959j0.f6311c;
                    if (str.equals(fragment2.f6083U)) {
                        return fragment2;
                    }
                }
            }
        } else {
            c0961k0.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final Fragment m3617E(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM3613A = m3613A(string);
        if (fragmentM3613A != null) {
            return fragmentM3613A;
        }
        m3651i0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final ViewGroup m3618F(Fragment fragment) {
        ViewGroup viewGroup = fragment.f6092b0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f6082T <= 0) {
            return null;
        }
        if (this.f6179v.mo588Z()) {
            View viewMo584V = this.f6179v.mo584V(fragment.f6082T);
            if (viewMo584V instanceof ViewGroup) {
                return (ViewGroup) viewMo584V;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final C0985w m3619G() {
        Fragment fragment = this.f6180w;
        return fragment != null ? fragment.f6077O.m3619G() : this.f6182y;
    }

    /* JADX INFO: renamed from: H */
    public final List<Fragment> m3620H() {
        return this.f6160c.m3762f();
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC0984v0 m3621I() {
        Fragment fragment = this.f6180w;
        return fragment != null ? fragment.f6077O.m3621I() : this.f6183z;
    }

    /* JADX INFO: renamed from: J */
    public final void m3622J(Fragment fragment) {
        if (m3608K(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f6084V) {
            return;
        }
        fragment.f6084V = true;
        fragment.f6102g0 = true ^ fragment.f6102g0;
        m3646f0(fragment);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m3623M() {
        Fragment fragment = this.f6180w;
        if (fragment == null) {
            return true;
        }
        return fragment.m3604y() && this.f6180w.m3598r().m3623M();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m3624P() {
        return this.f6149F || this.f6150G;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q */
    public final void m3625Q(int i10, boolean z10) {
        HashMap<String, C0959j0> map;
        AbstractC0986x<?> abstractC0986x;
        if (this.f6178u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f6177t) {
            this.f6177t = i10;
            C0961k0 c0961k0 = this.f6160c;
            Iterator<Fragment> it = c0961k0.f6318a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = c0961k0.f6319b;
                if (!zHasNext) {
                    break;
                }
                C0959j0 c0959j0 = map.get(it.next().f6099f);
                if (c0959j0 != null) {
                    c0959j0.m3748k();
                }
            }
            Iterator<C0959j0> it2 = map.values().iterator();
            loop1: while (true) {
                while (true) {
                    boolean z11 = false;
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    C0959j0 next = it2.next();
                    if (next == null) {
                        break;
                    }
                    next.m3748k();
                    Fragment fragment = next.f6311c;
                    if (fragment.f6070H && !fragment.m3556A()) {
                        z11 = true;
                    }
                    if (!z11) {
                        break;
                    }
                    if (fragment.f6071I && !c0961k0.f6320c.containsKey(fragment.f6099f)) {
                        next.m3753p();
                    }
                    c0961k0.m3764h(next);
                }
            }
            m3649h0();
            if (this.f6148E && (abstractC0986x = this.f6178u) != null && this.f6177t == 7) {
                abstractC0986x.mo3811o0();
                this.f6148E = false;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m3626R() {
        if (this.f6178u == null) {
            return;
        }
        this.f6149F = false;
        this.f6150G = false;
        this.f6156M.f6292i = false;
        while (true) {
            for (Fragment fragment : this.f6160c.m3762f()) {
                if (fragment != null) {
                    fragment.f6079Q.m3626R();
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m3627S() {
        m3665v(new C0930o(null, -1, 0), false);
    }

    /* JADX INFO: renamed from: T */
    public final void m3628T(String str) {
        m3665v(new C0930o(str, -1, 1), false);
    }

    /* JADX INFO: renamed from: U */
    public final boolean m3629U() {
        return m3630V(-1, 0);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m3630V(int i10, int i11) {
        m3667x(false);
        m3666w(true);
        Fragment fragment = this.f6181x;
        if (fragment != null && i10 < 0 && fragment.m3594l().m3629U()) {
            return true;
        }
        boolean zM3631W = m3631W(this.f6153J, this.f6154K, null, i10, i11);
        if (zM3631W) {
            this.f6159b = true;
            try {
                m3633Y(this.f6153J, this.f6154K);
                m3641d();
            } catch (Throwable th2) {
                m3641d();
                throw th2;
            }
        }
        m3653j0();
        if (this.f6152I) {
            this.f6152I = false;
            m3649h0();
        }
        this.f6160c.f6319b.values().removeAll(Collections.singleton(null));
        return zM3631W;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m3631W(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int iM3614B = m3614B(str, i10, (i11 & 1) != 0);
        if (iM3614B < 0) {
            return false;
        }
        for (int size = this.f6161d.size() - 1; size >= iM3614B; size--) {
            arrayList.add(this.f6161d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    public final void m3632X(Fragment fragment) {
        if (m3608K(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f6076N);
        }
        boolean z10 = !fragment.m3556A();
        if (!fragment.f6085W || z10) {
            C0961k0 c0961k0 = this.f6160c;
            synchronized (c0961k0.f6318a) {
                try {
                    c0961k0.f6318a.remove(fragment);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            fragment.f6111l = false;
            if (m3609L(fragment)) {
                this.f6148E = true;
            }
            fragment.f6070H = true;
            m3646f0(fragment);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m3633Y(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f6359p) {
                if (i11 != i10) {
                    m3669z(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f6359p) {
                        i11++;
                    }
                }
                m3669z(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m3669z(arrayList, arrayList2, i11, size);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m3634Z(Parcelable parcelable) {
        C0941a0 c0941a0;
        int i10;
        C0959j0 c0959j0;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f6178u.f6429b.getClassLoader());
                this.f6168k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f6178u.f6429b.getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        C0961k0 c0961k0 = this.f6160c;
        HashMap<String, FragmentState> map = c0961k0.f6320c;
        map.clear();
        for (FragmentState fragmentState : arrayList) {
            map.put(fragmentState.f6219b, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap<String, C0959j0> map2 = c0961k0.f6319b;
        map2.clear();
        Iterator<String> it = fragmentManagerState.f6209a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0941a0 = this.f6170m;
            if (!zHasNext) {
                break;
            }
            FragmentState fragmentStateM3765i = c0961k0.m3765i(it.next(), null);
            if (fragmentStateM3765i != null) {
                Fragment fragment = this.f6156M.f6287d.get(fragmentStateM3765i.f6219b);
                if (fragment != null) {
                    if (m3608K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    c0959j0 = new C0959j0(c0941a0, c0961k0, fragment, fragmentStateM3765i);
                } else {
                    c0959j0 = new C0959j0(this.f6170m, this.f6160c, this.f6178u.f6429b.getClassLoader(), m3619G(), fragmentStateM3765i);
                }
                Fragment fragment2 = c0959j0.f6311c;
                fragment2.f6077O = this;
                if (m3608K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.f6099f + "): " + fragment2);
                }
                c0959j0.m3750m(this.f6178u.f6429b.getClassLoader());
                c0961k0.m3763g(c0959j0);
                c0959j0.f6313e = this.f6177t;
            }
        }
        C0951f0 c0951f0 = this.f6156M;
        c0951f0.getClass();
        Iterator it2 = new ArrayList(c0951f0.f6287d.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if ((map2.get(fragment3.f6099f) != null ? 1 : 0) == 0) {
                if (m3608K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f6209a);
                }
                this.f6156M.m3729o2(fragment3);
                fragment3.f6077O = this;
                C0959j0 c0959j1 = new C0959j0(c0941a0, c0961k0, fragment3);
                c0959j1.f6313e = 1;
                c0959j1.m3748k();
                fragment3.f6070H = true;
                c0959j1.m3748k();
            }
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f6210b;
        c0961k0.f6318a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                Fragment fragmentM3758b = c0961k0.m3758b(str3);
                if (fragmentM3758b == null) {
                    throw new IllegalStateException(C0141b.m611g("No instantiated fragment for (", str3, ")"));
                }
                if (m3608K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentM3758b);
                }
                c0961k0.m3757a(fragmentM3758b);
            }
        }
        if (fragmentManagerState.f6211c != null) {
            this.f6161d = new ArrayList<>(fragmentManagerState.f6211c.length);
            int i11 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f6211c;
                if (i11 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i11];
                backStackRecordState.getClass();
                C0940a c0940a = new C0940a(this);
                backStackRecordState.m3555a(c0940a);
                c0940a.f6252s = backStackRecordState.f6061g;
                int i12 = 0;
                while (true) {
                    ArrayList<String> arrayList3 = backStackRecordState.f6056b;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = arrayList3.get(i12);
                    if (str4 != null) {
                        c0940a.f6344a.get(i12).f6361b = m3613A(str4);
                    }
                    i12++;
                }
                c0940a.m3696h(1);
                if (m3608K(2)) {
                    StringBuilder sbM614j = C0141b.m614j("restoreAllState: back stack #", i11, " (index ");
                    sbM614j.append(c0940a.f6252s);
                    sbM614j.append("): ");
                    sbM614j.append(c0940a);
                    Log.v("FragmentManager", sbM614j.toString());
                    PrintWriter printWriter = new PrintWriter(new C0982u0());
                    c0940a.m3699k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f6161d.add(c0940a);
                i11++;
            }
        } else {
            this.f6161d = null;
        }
        this.f6166i.set(fragmentManagerState.f6212d);
        String str5 = fragmentManagerState.f6213e;
        if (str5 != null) {
            Fragment fragmentM3613A = m3613A(str5);
            this.f6181x = fragmentM3613A;
            m3660q(fragmentM3613A);
        }
        ArrayList<String> arrayList4 = fragmentManagerState.f6214f;
        if (arrayList4 != null) {
            for (i10 = 0; i10 < arrayList4.size(); i10++) {
                this.f6167j.put(arrayList4.get(i10), fragmentManagerState.f6215g.get(i10));
            }
        }
        this.f6147D = new ArrayDeque<>(fragmentManagerState.f6216h);
    }

    /* JADX INFO: renamed from: a */
    public final C0959j0 m3635a(Fragment fragment) {
        String str = fragment.f6108j0;
        if (str != null) {
            FragmentStrictMode.m3802d(fragment, str);
        }
        if (m3608K(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0959j0 c0959j0M3645f = m3645f(fragment);
        fragment.f6077O = this;
        C0961k0 c0961k0 = this.f6160c;
        c0961k0.m3763g(c0959j0M3645f);
        if (!fragment.f6085W) {
            c0961k0.m3757a(fragment);
            fragment.f6070H = false;
            if (fragment.f6094c0 == null) {
                fragment.f6102g0 = false;
            }
            if (m3609L(fragment)) {
                this.f6148E = true;
            }
        }
        return c0959j0M3645f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a0 */
    public final Bundle m3636a0() {
        int i10;
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m3643e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f6234e) {
                if (m3608K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.f6234e = false;
                specialEffectsController.m3685c();
            }
        }
        Iterator it2 = m3643e().iterator();
        while (it2.hasNext()) {
            ((SpecialEffectsController) it2.next()).m3687e();
        }
        m3667x(true);
        this.f6149F = true;
        this.f6156M.f6292i = true;
        C0961k0 c0961k0 = this.f6160c;
        c0961k0.getClass();
        HashMap<String, C0959j0> map = c0961k0.f6319b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (C0959j0 c0959j0 : map.values()) {
            if (c0959j0 != null) {
                c0959j0.m3753p();
                Fragment fragment = c0959j0.f6311c;
                arrayList2.add(fragment.f6099f);
                if (m3608K(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.f6091b);
                }
            }
        }
        C0961k0 c0961k1 = this.f6160c;
        c0961k1.getClass();
        ArrayList<FragmentState> arrayList3 = new ArrayList(c0961k1.f6320c.values());
        if (arrayList3.isEmpty()) {
            if (m3608K(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return bundle;
        }
        C0961k0 c0961k2 = this.f6160c;
        synchronized (c0961k2.f6318a) {
            try {
                backStackRecordStateArr = null;
                if (!c0961k2.f6318a.isEmpty()) {
                    arrayList = new ArrayList<>(c0961k2.f6318a.size());
                    Iterator<Fragment> it3 = c0961k2.f6318a.iterator();
                    loop6: while (true) {
                        while (true) {
                            if (!it3.hasNext()) {
                                break loop6;
                            }
                            Fragment next = it3.next();
                            arrayList.add(next.f6099f);
                            if (m3608K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f6099f + "): " + next);
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList<C0940a> arrayList4 = this.f6161d;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (i10 = 0; i10 < size; i10++) {
                backStackRecordStateArr[i10] = new BackStackRecordState(this.f6161d.get(i10));
                if (m3608K(2)) {
                    StringBuilder sbM614j = C0141b.m614j("saveAllState: adding back stack #", i10, ": ");
                    sbM614j.append(this.f6161d.get(i10));
                    Log.v("FragmentManager", sbM614j.toString());
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f6209a = arrayList2;
        fragmentManagerState.f6210b = arrayList;
        fragmentManagerState.f6211c = backStackRecordStateArr;
        fragmentManagerState.f6212d = this.f6166i.get();
        Fragment fragment2 = this.f6181x;
        if (fragment2 != null) {
            fragmentManagerState.f6213e = fragment2.f6099f;
        }
        fragmentManagerState.f6214f.addAll(this.f6167j.keySet());
        fragmentManagerState.f6215g.addAll(this.f6167j.values());
        fragmentManagerState.f6216h = new ArrayList<>(this.f6147D);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this.f6168k.keySet()) {
            bundle.putBundle(C0204c.m852k("result_", str), this.f6168k.get(str));
        }
        for (FragmentState fragmentState : arrayList3) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", fragmentState);
            bundle.putBundle("fragment_" + fragmentState.f6219b, bundle2);
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: b */
    public final void m3637b(AbstractC0986x<?> abstractC0986x, AbstractC0140a abstractC0140a, Fragment fragment) {
        InterfaceC1051q interfaceC1051q;
        if (this.f6178u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f6178u = abstractC0986x;
        this.f6179v = abstractC0140a;
        this.f6180w = fragment;
        CopyOnWriteArrayList<InterfaceC0953g0> copyOnWriteArrayList = this.f6171n;
        if (fragment != null) {
            copyOnWriteArrayList.add(new C0922g(fragment));
        } else if (abstractC0986x instanceof InterfaceC0953g0) {
            copyOnWriteArrayList.add((InterfaceC0953g0) abstractC0986x);
        }
        if (this.f6180w != null) {
            m3653j0();
        }
        if (abstractC0986x instanceof InterfaceC0209s) {
            InterfaceC0209s interfaceC0209s = (InterfaceC0209s) abstractC0986x;
            OnBackPressedDispatcher onBackPressedDispatcherMo788b = interfaceC0209s.mo788b();
            this.f6164g = onBackPressedDispatcherMo788b;
            if (fragment != null) {
                interfaceC1051q = interfaceC0209s;
                interfaceC1051q = fragment;
            }
            interfaceC1051q = interfaceC0209s;
            onBackPressedDispatcherMo788b.m804a(interfaceC1051q, this.f6165h);
        }
        int i10 = 0;
        if (fragment != null) {
            C0951f0 c0951f0 = fragment.f6077O.f6156M;
            HashMap<String, C0951f0> map = c0951f0.f6288e;
            C0951f0 c0951f1 = map.get(fragment.f6099f);
            if (c0951f1 == null) {
                c0951f1 = new C0951f0(c0951f0.f6290g);
                map.put(fragment.f6099f, c0951f1);
            }
            this.f6156M = c0951f1;
        } else if (abstractC0986x instanceof InterfaceC1048n0) {
            this.f6156M = (C0951f0) new C1042k0(((InterfaceC1048n0) abstractC0986x).mo796n(), C0951f0.f6286j).m3947a(C0951f0.class);
        } else {
            this.f6156M = new C0951f0(false);
        }
        this.f6156M.f6292i = m3624P();
        this.f6160c.f6321d = this.f6156M;
        InterfaceC10461a interfaceC10461a = this.f6178u;
        if ((interfaceC10461a instanceof InterfaceC7706c) && fragment == null) {
            C1189a c1189aMo797q = ((InterfaceC7706c) interfaceC10461a).mo797q();
            c1189aMo797q.m4586c("android:support:fragments", new C0947d0(i10, this));
            Bundle bundleM4584a = c1189aMo797q.m4584a("android:support:fragments");
            if (bundleM4584a != null) {
                m3634Z(bundleM4584a);
            }
        }
        InterfaceC10461a interfaceC10461a2 = this.f6178u;
        if (interfaceC10461a2 instanceof InterfaceC0208g) {
            AbstractC0207f abstractC0207fMo793k = ((InterfaceC0208g) interfaceC10461a2).mo793k();
            String strM852k = C0204c.m852k("FragmentManager:", fragment != null ? C0009a.m23l(new StringBuilder(), fragment.f6099f, ":") : "");
            C0949e0 c0949e0 = (C0949e0) this;
            this.f6144A = abstractC0207fMo793k.m868d(C0166e.m765k(strM852k, "StartActivityForResult"), new C1644d(), new C0923h(c0949e0));
            this.f6145B = abstractC0207fMo793k.m868d(C0166e.m765k(strM852k, "StartIntentSenderForResult"), new C0926k(), new C0924i(c0949e0));
            this.f6146C = abstractC0207fMo793k.m868d(C0166e.m765k(strM852k, "RequestPermissions"), new C1642b(), new C0916a(c0949e0));
        }
        InterfaceC10461a interfaceC10461a3 = this.f6178u;
        if (interfaceC10461a3 instanceof InterfaceC7473b) {
            ((InterfaceC7473b) interfaceC10461a3).mo785E(this.f6172o);
        }
        InterfaceC10461a interfaceC10461a4 = this.f6178u;
        if (interfaceC10461a4 instanceof InterfaceC7474c) {
            ((InterfaceC7474c) interfaceC10461a4).mo794l(this.f6173p);
        }
        InterfaceC10461a interfaceC10461a5 = this.f6178u;
        if (interfaceC10461a5 instanceof InterfaceC7240s) {
            ((InterfaceC7240s) interfaceC10461a5).mo795m(this.f6174q);
        }
        InterfaceC10461a interfaceC10461a6 = this.f6178u;
        if (interfaceC10461a6 instanceof InterfaceC7241t) {
            ((InterfaceC7241t) interfaceC10461a6).mo789e(this.f6175r);
        }
        InterfaceC10461a interfaceC10461a7 = this.f6178u;
        if ((interfaceC10461a7 instanceof InterfaceC10042i) && fragment == null) {
            ((InterfaceC10042i) interfaceC10461a7).mo798t(this.f6176s);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3638b0() {
        synchronized (this.f6158a) {
            boolean z10 = true;
            if (this.f6158a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f6178u.f6430c.removeCallbacks(this.f6157N);
                this.f6178u.f6430c.post(this.f6157N);
                m3653j0();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3639c(Fragment fragment) {
        if (m3608K(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f6085W) {
            fragment.f6085W = false;
            if (!fragment.f6111l) {
                this.f6160c.m3757a(fragment);
                if (m3608K(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m3609L(fragment)) {
                    this.f6148E = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3640c0(Fragment fragment, boolean z10) {
        ViewGroup viewGroupM3618F = m3618F(fragment);
        if (viewGroupM3618F != null && (viewGroupM3618F instanceof FragmentContainerView)) {
            ((FragmentContainerView) viewGroupM3618F).setDrawDisappearingViewsLast(!z10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3641d() {
        this.f6159b = false;
        this.f6154K.clear();
        this.f6153J.clear();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m3642d0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(m3613A(fragment.f6099f)) && (fragment.f6078P == null || fragment.f6077O == this)) {
            fragment.f6110k0 = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m3643e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f6160c.m3760d().iterator();
        while (true) {
            while (it.hasNext()) {
                ViewGroup viewGroup = ((C0959j0) it.next()).f6311c.f6092b0;
                if (viewGroup != null) {
                    hashSet.add(SpecialEffectsController.m3682f(viewGroup, m3621I()));
                }
            }
            return hashSet;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r8.f6077O == r7) goto L14;
     */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3644e0(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(m3613A(fragment.f6099f))) {
                if (fragment.f6078P != null) {
                }
            }
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f6181x;
        this.f6181x = fragment;
        m3660q(fragment2);
        m3660q(this.f6181x);
    }

    /* JADX INFO: renamed from: f */
    public final C0959j0 m3645f(Fragment fragment) {
        String str = fragment.f6099f;
        C0961k0 c0961k0 = this.f6160c;
        C0959j0 c0959j0 = c0961k0.f6319b.get(str);
        if (c0959j0 != null) {
            return c0959j0;
        }
        C0959j0 c0959j1 = new C0959j0(this.f6170m, c0961k0, fragment);
        c0959j1.m3750m(this.f6178u.f6429b.getClassLoader());
        c0959j1.f6313e = this.f6177t;
        return c0959j1;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m3646f0(Fragment fragment) {
        ViewGroup viewGroupM3618F = m3618F(fragment);
        if (viewGroupM3618F != null) {
            Fragment.C0912c c0912c = fragment.f6100f0;
            boolean z10 = false;
            if ((c0912c == null ? 0 : c0912c.f6129e) + (c0912c == null ? 0 : c0912c.f6128d) + (c0912c == null ? 0 : c0912c.f6127c) + (c0912c == null ? 0 : c0912c.f6126b) > 0) {
                if (viewGroupM3618F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM3618F.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                Fragment fragment2 = (Fragment) viewGroupM3618F.getTag(R.id.visible_removing_fragment_view_tag);
                Fragment.C0912c c0912c2 = fragment.f6100f0;
                if (c0912c2 != null) {
                    z10 = c0912c2.f6125a;
                }
                if (fragment2.f6100f0 == null) {
                } else {
                    fragment2.m3588h().f6125a = z10;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m3647g(Fragment fragment) {
        if (m3608K(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f6085W) {
            return;
        }
        fragment.f6085W = true;
        if (fragment.f6111l) {
            if (m3608K(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            C0961k0 c0961k0 = this.f6160c;
            synchronized (c0961k0.f6318a) {
                c0961k0.f6318a.remove(fragment);
            }
            fragment.f6111l = false;
            if (m3609L(fragment)) {
                this.f6148E = true;
            }
            m3646f0(fragment);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m3648h(boolean z10, Configuration configuration) {
        if (z10 && (this.f6178u instanceof InterfaceC7473b)) {
            m3651i0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6160c.m3762f()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                if (z10) {
                    fragment.f6079Q.m3648h(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3649h0() {
        for (C0959j0 c0959j0 : this.f6160c.m3760d()) {
            Fragment fragment = c0959j0.f6311c;
            if (fragment.f6096d0) {
                if (this.f6159b) {
                    this.f6152I = true;
                } else {
                    fragment.f6096d0 = false;
                    c0959j0.m3748k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3650i() {
        if (this.f6177t < 1) {
            return false;
        }
        for (Fragment fragment : this.f6160c.m3762f()) {
            if (fragment != null) {
                if (!fragment.f6084V ? fragment.f6079Q.m3650i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i0 */
    public final void m3651i0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0982u0());
        AbstractC0986x<?> abstractC0986x = this.f6178u;
        if (abstractC0986x != null) {
            try {
                abstractC0986x.mo3807k0(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            m3664u("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3652j() {
        if (this.f6177t < 1) {
            return false;
        }
        Iterator<Fragment> it = this.f6160c.m3762f().iterator();
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Fragment next = it.next();
                if (next == null || !m3610N(next)) {
                    break;
                }
                if (!(!next.f6084V ? next.f6079Q.m3652j() | false : false)) {
                    break;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z10 = true;
            }
        }
        if (this.f6162e != null) {
            for (int i10 = 0; i10 < this.f6162e.size(); i10++) {
                Fragment fragment = this.f6162e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.getClass();
                }
            }
        }
        this.f6162e = arrayList;
        return z10;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3653j0() {
        synchronized (this.f6158a) {
            try {
                if (!this.f6158a.isEmpty()) {
                    C0917b c0917b = this.f6165h;
                    c0917b.f500a = true;
                    InterfaceC2041a<C9072e> interfaceC2041a = c0917b.f502c;
                    if (interfaceC2041a != null) {
                        interfaceC2041a.mo807E();
                    }
                    return;
                }
                C0917b c0917b2 = this.f6165h;
                ArrayList<C0940a> arrayList = this.f6161d;
                c0917b2.f500a = (arrayList != null ? arrayList.size() : 0) > 0 && m3611O(this.f6180w);
                InterfaceC2041a<C9072e> interfaceC2041a2 = c0917b2.f502c;
                if (interfaceC2041a2 != null) {
                    interfaceC2041a2.mo807E();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3654k() {
        boolean zIsChangingConfigurations;
        this.f6151H = true;
        m3667x(true);
        Iterator it = m3643e().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).m3687e();
        }
        AbstractC0986x<?> abstractC0986x = this.f6178u;
        boolean z10 = abstractC0986x instanceof InterfaceC1048n0;
        C0961k0 c0961k0 = this.f6160c;
        if (z10) {
            zIsChangingConfigurations = c0961k0.f6321d.f6291h;
        } else {
            Context context = abstractC0986x.f6429b;
            zIsChangingConfigurations = context instanceof Activity ? true ^ ((Activity) context).isChangingConfigurations() : true;
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it2 = this.f6167j.values().iterator();
            while (it2.hasNext()) {
                for (String str : it2.next().f6067a) {
                    C0951f0 c0951f0 = c0961k0.f6321d;
                    c0951f0.getClass();
                    if (m3608K(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c0951f0.m3728n2(str);
                }
            }
        }
        m3663t(-1);
        InterfaceC10461a interfaceC10461a = this.f6178u;
        if (interfaceC10461a instanceof InterfaceC7474c) {
            ((InterfaceC7474c) interfaceC10461a).mo790f(this.f6173p);
        }
        InterfaceC10461a interfaceC10461a2 = this.f6178u;
        if (interfaceC10461a2 instanceof InterfaceC7473b) {
            ((InterfaceC7473b) interfaceC10461a2).mo799w(this.f6172o);
        }
        InterfaceC10461a interfaceC10461a3 = this.f6178u;
        if (interfaceC10461a3 instanceof InterfaceC7240s) {
            ((InterfaceC7240s) interfaceC10461a3).mo784B(this.f6174q);
        }
        InterfaceC10461a interfaceC10461a4 = this.f6178u;
        if (interfaceC10461a4 instanceof InterfaceC7241t) {
            ((InterfaceC7241t) interfaceC10461a4).mo791g(this.f6175r);
        }
        InterfaceC10461a interfaceC10461a5 = this.f6178u;
        if ((interfaceC10461a5 instanceof InterfaceC10042i) && this.f6180w == null) {
            ((InterfaceC10042i) interfaceC10461a5).mo783A(this.f6176s);
        }
        this.f6178u = null;
        this.f6179v = null;
        this.f6180w = null;
        if (this.f6164g != null) {
            Iterator<InterfaceC0182a> it3 = this.f6165h.f501b.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
            this.f6164g = null;
        }
        C0206e c0206e = this.f6144A;
        if (c0206e != null) {
            c0206e.m865b();
            this.f6145B.m865b();
            this.f6146C.m865b();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final void m3655l(boolean z10) {
        if (z10 && (this.f6178u instanceof InterfaceC7474c)) {
            m3651i0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        while (true) {
            for (Fragment fragment : this.f6160c.m3762f()) {
                if (fragment != null) {
                    fragment.onLowMemory();
                    if (z10) {
                        fragment.f6079Q.m3655l(true);
                    }
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3656m(boolean z10, boolean z11) {
        if (z11 && (this.f6178u instanceof InterfaceC7240s)) {
            m3651i0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6160c.m3762f()) {
            if (fragment != null && z11) {
                fragment.f6079Q.m3656m(z10, true);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3657n() {
        for (Fragment fragment : this.f6160c.m3761e()) {
            if (fragment != null) {
                fragment.m3605z();
                fragment.f6079Q.m3657n();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3658o() {
        if (this.f6177t < 1) {
            return false;
        }
        for (Fragment fragment : this.f6160c.m3762f()) {
            if (fragment != null) {
                if (!fragment.f6084V ? fragment.f6079Q.m3658o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m3659p() {
        if (this.f6177t < 1) {
            return;
        }
        for (Fragment fragment : this.f6160c.m3762f()) {
            if (fragment != null && !fragment.f6084V) {
                fragment.f6079Q.m3659p();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3660q(Fragment fragment) {
        if (fragment != null && fragment.equals(m3613A(fragment.f6099f))) {
            fragment.f6077O.getClass();
            boolean zM3611O = m3611O(fragment);
            Boolean bool = fragment.f6109k;
            if (bool == null || bool.booleanValue() != zM3611O) {
                fragment.f6109k = Boolean.valueOf(zM3611O);
                fragment.mo3567P(zM3611O);
                C0949e0 c0949e0 = fragment.f6079Q;
                c0949e0.m3653j0();
                c0949e0.m3660q(c0949e0.f6181x);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final void m3661r(boolean z10, boolean z11) {
        if (z11 && (this.f6178u instanceof InterfaceC7241t)) {
            m3651i0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6160c.m3762f()) {
            if (fragment != null && z11) {
                fragment.f6079Q.m3661r(z10, true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3662s() {
        if (this.f6177t < 1) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            for (Fragment fragment : this.f6160c.m3762f()) {
                if (fragment != null && m3610N(fragment)) {
                    if (!fragment.f6084V ? fragment.f6079Q.m3662s() | false : false) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public final void m3663t(int i10) {
        try {
            this.f6159b = true;
            Iterator<C0959j0> it = this.f6160c.f6319b.values().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    C0959j0 next = it.next();
                    if (next != null) {
                        next.f6313e = i10;
                    }
                }
            }
            m3625Q(i10, false);
            Iterator it2 = m3643e().iterator();
            while (it2.hasNext()) {
                ((SpecialEffectsController) it2.next()).m3687e();
            }
            this.f6159b = false;
            m3667x(true);
        } catch (Throwable th2) {
            this.f6159b = false;
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(BuildConfig.SDK_TRUNCATE_LENGTH);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f6180w;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f6180w)));
            sb2.append("}");
        } else {
            AbstractC0986x<?> abstractC0986x = this.f6178u;
            if (abstractC0986x != null) {
                sb2.append(abstractC0986x.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f6178u)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u */
    public final void m3664u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM765k = C0166e.m765k(str, "    ");
        C0961k0 c0961k0 = this.f6160c;
        c0961k0.getClass();
        String str2 = str + "    ";
        HashMap<String, C0959j0> map = c0961k0.f6319b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0959j0 c0959j0 : map.values()) {
                printWriter.print(str);
                if (c0959j0 != null) {
                    Fragment fragment = c0959j0.f6311c;
                    printWriter.println(fragment);
                    fragment.mo3586g(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = c0961k0.f6318a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                Fragment fragment2 = arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f6162e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                Fragment fragment3 = this.f6162e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<C0940a> arrayList3 = this.f6161d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                C0940a c0940a = this.f6161d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c0940a.toString());
                c0940a.m3699k(strM765k, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6166i.get());
        synchronized (this.f6158a) {
            try {
                int size4 = this.f6158a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (InterfaceC0929n) this.f6158a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f6178u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6179v);
        if (this.f6180w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6180w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6177t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f6149F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6150G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f6151H);
        if (this.f6148E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f6148E);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: v */
    public final void m3665v(InterfaceC0929n interfaceC0929n, boolean z10) {
        if (!z10) {
            if (this.f6178u == null) {
                if (!this.f6151H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m3624P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f6158a) {
            if (this.f6178u == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f6158a.add(interfaceC0929n);
                m3638b0();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: w */
    public final void m3666w(boolean z10) {
        if (this.f6159b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f6178u == null) {
            if (!this.f6151H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f6178u.f6430c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && m3624P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f6153J == null) {
            this.f6153J = new ArrayList<>();
            this.f6154K = new ArrayList<>();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m3667x(boolean z10) {
        boolean zMo3680b;
        m3666w(z10);
        boolean z11 = false;
        while (true) {
            ArrayList<C0940a> arrayList = this.f6153J;
            ArrayList<Boolean> arrayList2 = this.f6154K;
            synchronized (this.f6158a) {
                if (this.f6158a.isEmpty()) {
                    zMo3680b = false;
                } else {
                    try {
                        int size = this.f6158a.size();
                        zMo3680b = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zMo3680b |= this.f6158a.get(i10).mo3680b(arrayList, arrayList2);
                        }
                        this.f6158a.clear();
                        this.f6178u.f6430c.removeCallbacks(this.f6157N);
                    } catch (Throwable th2) {
                        this.f6158a.clear();
                        this.f6178u.f6430c.removeCallbacks(this.f6157N);
                        throw th2;
                    }
                }
            }
            if (!zMo3680b) {
                break;
            }
            z11 = true;
            this.f6159b = true;
            try {
                m3633Y(this.f6153J, this.f6154K);
                m3641d();
            } catch (Throwable th3) {
                m3641d();
                throw th3;
            }
        }
        m3653j0();
        if (this.f6152I) {
            this.f6152I = false;
            m3649h0();
        }
        this.f6160c.f6319b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    /* JADX INFO: renamed from: y */
    public final void m3668y(InterfaceC0929n interfaceC0929n, boolean z10) {
        if (z10 && (this.f6178u == null || this.f6151H)) {
            return;
        }
        m3666w(z10);
        if (interfaceC0929n.mo3680b(this.f6153J, this.f6154K)) {
            this.f6159b = true;
            try {
                m3633Y(this.f6153J, this.f6154K);
                m3641d();
            } catch (Throwable th2) {
                m3641d();
                throw th2;
            }
        }
        m3653j0();
        if (this.f6152I) {
            this.f6152I = false;
            m3649h0();
        }
        this.f6160c.f6319b.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0248 A[PHI: r13
      0x0248: PHI (r13v15 int) = (r13v13 int), (r13v16 int), (r13v17 int) binds: [B:106:0x0237, B:108:0x023d, B:113:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0175  */
    /* JADX INFO: renamed from: z */
    public final void m3669z(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        C0961k0 c0961k0;
        C0961k0 c0961k1;
        int i12;
        int i13;
        ArrayList<C0940a> arrayList3 = arrayList;
        boolean z10 = arrayList3.get(i10).f6359p;
        ArrayList<Fragment> arrayList4 = this.f6155L;
        if (arrayList4 == null) {
            this.f6155L = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        ArrayList<Fragment> arrayList5 = this.f6155L;
        C0961k0 c0961k2 = this.f6160c;
        arrayList5.addAll(c0961k2.m3762f());
        Fragment fragment = this.f6181x;
        int i14 = i10;
        boolean z11 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i11) {
                C0961k0 c0961k3 = c0961k2;
                this.f6155L.clear();
                if (!z10 && this.f6177t >= 1) {
                    for (int i16 = i10; i16 < i11; i16++) {
                        Iterator<AbstractC0963l0.a> it = arrayList.get(i16).f6344a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f6361b;
                            if (fragment2 == null || fragment2.f6077O == null) {
                                c0961k0 = c0961k3;
                            } else {
                                c0961k0 = c0961k3;
                                c0961k0.m3763g(m3645f(fragment2));
                            }
                            c0961k3 = c0961k0;
                        }
                    }
                }
                for (int i17 = i10; i17 < i11; i17++) {
                    C0940a c0940a = arrayList.get(i17);
                    if (!arrayList2.get(i17).booleanValue()) {
                        c0940a.m3696h(1);
                        ArrayList<AbstractC0963l0.a> arrayList6 = c0940a.f6344a;
                        int size = arrayList6.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            AbstractC0963l0.a aVar = arrayList6.get(i18);
                            Fragment fragment3 = aVar.f6361b;
                            if (fragment3 != null) {
                                fragment3.f6071I = c0940a.f6253t;
                                if (fragment3.f6100f0 != null) {
                                    fragment3.m3588h().f6125a = false;
                                }
                                int i19 = c0940a.f6349f;
                                if (fragment3.f6100f0 != null || i19 != 0) {
                                    fragment3.m3588h();
                                    fragment3.f6100f0.f6130f = i19;
                                }
                                ArrayList<String> arrayList7 = c0940a.f6357n;
                                ArrayList<String> arrayList8 = c0940a.f6358o;
                                fragment3.m3588h();
                                Fragment.C0912c c0912c = fragment3.f6100f0;
                                c0912c.f6131g = arrayList7;
                                c0912c.f6132h = arrayList8;
                            }
                            int i20 = aVar.f6360a;
                            FragmentManager fragmentManager = c0940a.f6250q;
                            switch (i20) {
                                case 1:
                                    fragment3.m3581d0(aVar.f6363d, aVar.f6364e, aVar.f6365f, aVar.f6366g);
                                    fragmentManager.m3640c0(fragment3, false);
                                    fragmentManager.m3635a(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f6360a);
                                case 3:
                                    fragment3.m3581d0(aVar.f6363d, aVar.f6364e, aVar.f6365f, aVar.f6366g);
                                    fragmentManager.m3632X(fragment3);
                                    break;
                                case 4:
                                    fragment3.m3581d0(aVar.f6363d, aVar.f6364e, aVar.f6365f, aVar.f6366g);
                                    fragmentManager.m3622J(fragment3);
                                    break;
                                case 5:
                                    fragment3.m3581d0(aVar.f6363d, aVar.f6364e, aVar.f6365f, aVar.f6366g);
                                    fragmentManager.m3640c0(fragment3, false);
                                    m3612g0(fragment3);
                                    break;
                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    fragment3.m3581d0(aVar.f6363d, aVar.f6364e, aVar.f6365f, aVar.f6366g);
                                    fragmentManager.m3647g(fragment3);
                                    break;
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    fragment3.m3581d0(aVar.f6363d, aVar.f6364e, aVar.f6365f, aVar.f6366g);
                                    fragmentManager.m3640c0(fragment3, false);
                                    fragmentManager.m3639c(fragment3);
                                    break;
                                case 8:
                                    fragmentManager.m3644e0(fragment3);
                                    break;
                                case 9:
                                    fragmentManager.m3644e0(null);
                                    break;
                                case 10:
                                    fragmentManager.m3642d0(fragment3, aVar.f6368i);
                                    break;
                            }
                        }
                    } else {
                        c0940a.m3696h(-1);
                        ArrayList<AbstractC0963l0.a> arrayList9 = c0940a.f6344a;
                        for (int size2 = arrayList9.size() - 1; size2 >= 0; size2--) {
                            AbstractC0963l0.a aVar2 = arrayList9.get(size2);
                            Fragment fragment4 = aVar2.f6361b;
                            if (fragment4 != null) {
                                fragment4.f6071I = c0940a.f6253t;
                                if (fragment4.f6100f0 != null) {
                                    fragment4.m3588h().f6125a = true;
                                }
                                int i21 = c0940a.f6349f;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 8197;
                                        i23 = 4100;
                                        if (i21 == 8197) {
                                            i22 = i23;
                                        } else if (i21 == 4099) {
                                            i23 = 4099;
                                            i22 = i23;
                                        } else if (i21 != 4100) {
                                            i22 = 0;
                                        }
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                if (fragment4.f6100f0 != null || i22 != 0) {
                                    fragment4.m3588h();
                                    fragment4.f6100f0.f6130f = i22;
                                }
                                ArrayList<String> arrayList10 = c0940a.f6358o;
                                ArrayList<String> arrayList11 = c0940a.f6357n;
                                fragment4.m3588h();
                                Fragment.C0912c c0912c2 = fragment4.f6100f0;
                                c0912c2.f6131g = arrayList10;
                                c0912c2.f6132h = arrayList11;
                            }
                            int i24 = aVar2.f6360a;
                            FragmentManager fragmentManager2 = c0940a.f6250q;
                            switch (i24) {
                                case 1:
                                    fragment4.m3581d0(aVar2.f6363d, aVar2.f6364e, aVar2.f6365f, aVar2.f6366g);
                                    fragmentManager2.m3640c0(fragment4, true);
                                    fragmentManager2.m3632X(fragment4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar2.f6360a);
                                case 3:
                                    fragment4.m3581d0(aVar2.f6363d, aVar2.f6364e, aVar2.f6365f, aVar2.f6366g);
                                    fragmentManager2.m3635a(fragment4);
                                    break;
                                case 4:
                                    fragment4.m3581d0(aVar2.f6363d, aVar2.f6364e, aVar2.f6365f, aVar2.f6366g);
                                    fragmentManager2.getClass();
                                    m3612g0(fragment4);
                                    break;
                                case 5:
                                    fragment4.m3581d0(aVar2.f6363d, aVar2.f6364e, aVar2.f6365f, aVar2.f6366g);
                                    fragmentManager2.m3640c0(fragment4, true);
                                    fragmentManager2.m3622J(fragment4);
                                    break;
                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    fragment4.m3581d0(aVar2.f6363d, aVar2.f6364e, aVar2.f6365f, aVar2.f6366g);
                                    fragmentManager2.m3639c(fragment4);
                                    break;
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    fragment4.m3581d0(aVar2.f6363d, aVar2.f6364e, aVar2.f6365f, aVar2.f6366g);
                                    fragmentManager2.m3640c0(fragment4, true);
                                    fragmentManager2.m3647g(fragment4);
                                    break;
                                case 8:
                                    fragmentManager2.m3644e0(null);
                                    break;
                                case 9:
                                    fragmentManager2.m3644e0(fragment4);
                                    break;
                                case 10:
                                    fragmentManager2.m3642d0(fragment4, aVar2.f6367h);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
                for (int i25 = i10; i25 < i11; i25++) {
                    C0940a c0940a2 = arrayList.get(i25);
                    if (zBooleanValue) {
                        for (int size3 = c0940a2.f6344a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = c0940a2.f6344a.get(size3).f6361b;
                            if (fragment5 != null) {
                                m3645f(fragment5).m3748k();
                            }
                        }
                    } else {
                        Iterator<AbstractC0963l0.a> it2 = c0940a2.f6344a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment6 = it2.next().f6361b;
                            if (fragment6 != null) {
                                m3645f(fragment6).m3748k();
                            }
                        }
                    }
                }
                m3625Q(this.f6177t, true);
                HashSet<SpecialEffectsController> hashSet = new HashSet();
                for (int i26 = i10; i26 < i11; i26++) {
                    Iterator<AbstractC0963l0.a> it3 = arrayList.get(i26).f6344a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment7 = it3.next().f6361b;
                        if (fragment7 != null && (viewGroup = fragment7.f6092b0) != null) {
                            hashSet.add(SpecialEffectsController.m3682f(viewGroup, m3621I()));
                        }
                    }
                }
                for (SpecialEffectsController specialEffectsController : hashSet) {
                    specialEffectsController.f6233d = zBooleanValue;
                    specialEffectsController.m3688g();
                    specialEffectsController.m3685c();
                }
                for (int i27 = i10; i27 < i11; i27++) {
                    C0940a c0940a3 = arrayList.get(i27);
                    if (arrayList2.get(i27).booleanValue() && c0940a3.f6252s >= 0) {
                        c0940a3.f6252s = -1;
                    }
                    c0940a3.getClass();
                }
                return;
            }
            C0940a c0940a4 = arrayList3.get(i14);
            if (arrayList2.get(i14).booleanValue()) {
                c0961k1 = c0961k2;
                int i28 = 1;
                ArrayList<Fragment> arrayList12 = this.f6155L;
                ArrayList<AbstractC0963l0.a> arrayList13 = c0940a4.f6344a;
                int size4 = arrayList13.size() - 1;
                while (size4 >= 0) {
                    AbstractC0963l0.a aVar3 = arrayList13.get(size4);
                    int i29 = aVar3.f6360a;
                    if (i29 != i28) {
                        if (i29 != 3) {
                            switch (i29) {
                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    arrayList12.add(aVar3.f6361b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar3.f6361b;
                                    break;
                                case 10:
                                    aVar3.f6368i = aVar3.f6367h;
                                    break;
                            }
                        } else {
                            arrayList12.add(aVar3.f6361b);
                        }
                        size4--;
                        i28 = 1;
                    }
                    arrayList12.remove(aVar3.f6361b);
                    size4--;
                    i28 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList14 = this.f6155L;
                int i30 = 0;
                while (true) {
                    ArrayList<AbstractC0963l0.a> arrayList15 = c0940a4.f6344a;
                    if (i30 < arrayList15.size()) {
                        AbstractC0963l0.a aVar4 = arrayList15.get(i30);
                        int i31 = aVar4.f6360a;
                        if (i31 != i15) {
                            if (i31 != 2) {
                                if (i31 == 3 || i31 == 6) {
                                    arrayList14.remove(aVar4.f6361b);
                                    Fragment fragment8 = aVar4.f6361b;
                                    if (fragment8 == fragment) {
                                        arrayList15.add(i30, new AbstractC0963l0.a(9, fragment8));
                                        i30++;
                                        c0961k2 = c0961k2;
                                        i12 = 1;
                                        fragment = null;
                                    }
                                } else if (i31 == 7) {
                                    i12 = 1;
                                } else if (i31 == 8) {
                                    arrayList15.add(i30, new AbstractC0963l0.a(9, fragment, 0));
                                    aVar4.f6362c = true;
                                    i30++;
                                    fragment = aVar4.f6361b;
                                }
                                c0961k2 = c0961k2;
                                i12 = 1;
                            } else {
                                Fragment fragment9 = aVar4.f6361b;
                                int i32 = fragment9.f6082T;
                                int size5 = arrayList14.size() - 1;
                                boolean z12 = false;
                                while (size5 >= 0) {
                                    C0961k0 c0961k4 = c0961k2;
                                    Fragment fragment10 = arrayList14.get(size5);
                                    if (fragment10.f6082T != i32) {
                                        i32 = i32;
                                    } else if (fragment10 == fragment9) {
                                        i32 = i32;
                                        z12 = true;
                                    } else {
                                        if (fragment10 == fragment) {
                                            i13 = 0;
                                            arrayList15.add(i30, new AbstractC0963l0.a(9, fragment10, 0));
                                            i30++;
                                            fragment = null;
                                        } else {
                                            i13 = 0;
                                        }
                                        AbstractC0963l0.a aVar5 = new AbstractC0963l0.a(3, fragment10, i13);
                                        aVar5.f6363d = aVar4.f6363d;
                                        aVar5.f6365f = aVar4.f6365f;
                                        aVar5.f6364e = aVar4.f6364e;
                                        aVar5.f6366g = aVar4.f6366g;
                                        arrayList15.add(i30, aVar5);
                                        arrayList14.remove(fragment10);
                                        i30++;
                                        fragment = fragment;
                                    }
                                    size5--;
                                    i32 = i32;
                                    c0961k2 = c0961k4;
                                }
                                c0961k2 = c0961k2;
                                i12 = 1;
                                if (z12) {
                                    arrayList15.remove(i30);
                                    i30--;
                                } else {
                                    aVar4.f6360a = 1;
                                    aVar4.f6362c = true;
                                    arrayList14.add(fragment9);
                                }
                            }
                            i30 += i12;
                            i15 = i12;
                            c0961k2 = c0961k2;
                        } else {
                            i12 = i15;
                        }
                        arrayList14.add(aVar4.f6361b);
                        i30 += i12;
                        i15 = i12;
                        c0961k2 = c0961k2;
                    } else {
                        c0961k1 = c0961k2;
                    }
                }
            }
            z11 = z11 || c0940a4.f6350g;
            i14++;
            arrayList3 = arrayList;
            c0961k2 = c0961k1;
        }
    }
}
