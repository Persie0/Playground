package androidx.fragment.app;

import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.view.Lifecycle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0940a extends AbstractC0963l0 implements FragmentManager.InterfaceC0925j, FragmentManager.InterfaceC0929n {

    /* JADX INFO: renamed from: q */
    public final FragmentManager f6250q;

    /* JADX INFO: renamed from: r */
    public boolean f6251r;

    /* JADX INFO: renamed from: s */
    public int f6252s;

    /* JADX INFO: renamed from: t */
    public boolean f6253t;

    public C0940a(FragmentManager fragmentManager) {
        fragmentManager.m3619G();
        AbstractC0986x<?> abstractC0986x = fragmentManager.f6178u;
        if (abstractC0986x != null) {
            abstractC0986x.f6429b.getClassLoader();
        }
        this.f6252s = -1;
        this.f6253t = false;
        this.f6250q = fragmentManager;
    }

    public C0940a(C0940a c0940a) {
        c0940a.f6250q.m3619G();
        AbstractC0986x<?> abstractC0986x = c0940a.f6250q.f6178u;
        if (abstractC0986x != null) {
            abstractC0986x.f6429b.getClassLoader();
        }
        Iterator<AbstractC0963l0.a> it = c0940a.f6344a.iterator();
        while (it.hasNext()) {
            this.f6344a.add(new AbstractC0963l0.a(it.next()));
        }
        this.f6345b = c0940a.f6345b;
        this.f6346c = c0940a.f6346c;
        this.f6347d = c0940a.f6347d;
        this.f6348e = c0940a.f6348e;
        this.f6349f = c0940a.f6349f;
        this.f6350g = c0940a.f6350g;
        this.f6351h = c0940a.f6351h;
        this.f6352i = c0940a.f6352i;
        this.f6355l = c0940a.f6355l;
        this.f6356m = c0940a.f6356m;
        this.f6353j = c0940a.f6353j;
        this.f6354k = c0940a.f6354k;
        if (c0940a.f6357n != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f6357n = arrayList;
            arrayList.addAll(c0940a.f6357n);
        }
        if (c0940a.f6358o != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f6358o = arrayList2;
            arrayList2.addAll(c0940a.f6358o);
        }
        this.f6359p = c0940a.f6359p;
        this.f6252s = -1;
        this.f6253t = false;
        this.f6250q = c0940a.f6250q;
        this.f6251r = c0940a.f6251r;
        this.f6252s = c0940a.f6252s;
        this.f6253t = c0940a.f6253t;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0925j
    /* JADX INFO: renamed from: a */
    public final String mo3676a() {
        return this.f6352i;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0929n
    /* JADX INFO: renamed from: b */
    public final boolean mo3680b(ArrayList<C0940a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f6350g) {
            FragmentManager fragmentManager = this.f6250q;
            if (fragmentManager.f6161d == null) {
                fragmentManager.f6161d = new ArrayList<>();
            }
            fragmentManager.f6161d.add(this);
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.fragment.app.AbstractC0963l0
    /* JADX INFO: renamed from: f */
    public final void mo3695f(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.f6108j0;
        if (str2 != null) {
            FragmentStrictMode.m3802d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f6083U;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f6083U + " now " + str);
            }
            fragment.f6083U = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.f6081S;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f6081S + " now " + i10);
            }
            fragment.f6081S = i10;
            fragment.f6082T = i10;
        }
        m3774c(new AbstractC0963l0.a(i11, fragment));
        fragment.f6077O = this.f6250q;
    }

    /* JADX INFO: renamed from: h */
    public final void m3696h(int i10) {
        if (this.f6350g) {
            if (FragmentManager.m3608K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList<AbstractC0963l0.a> arrayList = this.f6344a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0963l0.a aVar = arrayList.get(i11);
                Fragment fragment = aVar.f6361b;
                if (fragment != null) {
                    fragment.f6076N += i10;
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f6361b + " to " + aVar.f6361b.f6076N);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m3697i() {
        return m3698j(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final int m3698j(boolean z10) {
        if (this.f6251r) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0982u0());
            m3699k("  ", printWriter, true);
            printWriter.close();
        }
        this.f6251r = true;
        boolean z11 = this.f6350g;
        FragmentManager fragmentManager = this.f6250q;
        if (z11) {
            this.f6252s = fragmentManager.f6166i.getAndIncrement();
        } else {
            this.f6252s = -1;
        }
        fragmentManager.m3665v(this, z10);
        return this.f6252s;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final void m3699k(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6352i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6252s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6251r);
            if (this.f6349f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6349f));
            }
            if (this.f6345b != 0 || this.f6346c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6345b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6346c));
            }
            if (this.f6347d != 0 || this.f6348e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6347d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6348e));
            }
            if (this.f6353j != 0 || this.f6354k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6353j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6354k);
            }
            if (this.f6355l != 0 || this.f6356m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6355l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6356m);
            }
        }
        ArrayList<AbstractC0963l0.a> arrayList = this.f6344a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0963l0.a aVar = arrayList.get(i10);
                switch (aVar.f6360a) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        str2 = "DETACH";
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f6360a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f6361b);
                if (z10) {
                    if (aVar.f6363d != 0 || aVar.f6364e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f6363d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f6364e));
                    }
                    if (aVar.f6365f != 0 || aVar.f6366g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f6365f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f6366g));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final C0940a m3700l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f6077O;
        if (fragmentManager == null || fragmentManager == this.f6250q) {
            m3774c(new AbstractC0963l0.a(3, fragment));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: m */
    public final C0940a m3701m(Fragment fragment, Lifecycle.State state) {
        FragmentManager fragmentManager = fragment.f6077O;
        FragmentManager fragmentManager2 = this.f6250q;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.f6089a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            m3774c(new AbstractC0963l0.a(fragment, state));
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* JADX INFO: renamed from: n */
    public final C0940a m3702n(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.f6077O) != null) {
            if (fragmentManager != this.f6250q) {
                throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
            }
        }
        m3774c(new AbstractC0963l0.a(8, fragment));
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(BuildConfig.SDK_TRUNCATE_LENGTH);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6252s >= 0) {
            sb2.append(" #");
            sb2.append(this.f6252s);
        }
        if (this.f6352i != null) {
            sb2.append(" ");
            sb2.append(this.f6352i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
