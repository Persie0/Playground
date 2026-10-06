package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: au */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0048au extends AbstractC0118cx implements InterfaceC0096co {

    /* JADX INFO: renamed from: a */
    final C0111cq f2399a;

    /* JADX INFO: renamed from: b */
    boolean f2400b;

    /* JADX INFO: renamed from: c */
    int f2401c;

    public C0048au(C0111cq c0111cq) {
        c0111cq.m5326h();
        C0086ce c0086ce = c0111cq.f8789i;
        if (c0086ce != null) {
            c0086ce.f5399c.getClassLoader();
        }
        this.f2401c = -1;
        this.f2399a = c0111cq;
    }

    /* JADX INFO: renamed from: a */
    final void m2014a(int i) {
        if (this.f9932j) {
            if (C0111cq.m5275S(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(BcwGDRhrTsnlj.YYUO);
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.f9926d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0117cw c0117cw = (C0117cw) this.f9926d.get(i2);
                ComponentCallbacksC0077bw componentCallbacksC0077bw = c0117cw.f9850b;
                if (componentCallbacksC0077bw != null) {
                    componentCallbacksC0077bw.f4622x += i;
                    if (C0111cq.m5275S(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(c0117cw.f9850b);
                        sb2.append(" to ");
                        sb2.append(c0117cw.f9850b.f4622x);
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC0118cx
    /* JADX INFO: renamed from: b */
    public final void mo2015b() {
        m5700p();
        this.f2399a.m5297E(this, false);
    }

    @Override // p000.AbstractC0118cx
    /* JADX INFO: renamed from: c */
    public final void mo2016c() {
        m5700p();
        this.f2399a.m5297E(this, true);
    }

    @Override // p000.AbstractC0118cx
    /* JADX INFO: renamed from: d */
    public final void mo2017d(int i, ComponentCallbacksC0077bw componentCallbacksC0077bw, String str, int i2) {
        String str2 = componentCallbacksC0077bw.mPreviousWho;
        if (str2 != null) {
            ajr.m839a(componentCallbacksC0077bw, str2);
        }
        Class<?> cls = componentCallbacksC0077bw.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC0077bw.f4577E;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0077bw + ": was " + componentCallbacksC0077bw.f4577E + " now " + str);
            }
            componentCallbacksC0077bw.f4577E = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException(YmzeHXaMYOLk.reJxIVPYImI + componentCallbacksC0077bw + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC0077bw.f4575C;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0077bw + ": was " + componentCallbacksC0077bw.f4575C + " now " + i);
            }
            componentCallbacksC0077bw.f4575C = i;
            componentCallbacksC0077bw.f4576D = i;
        }
        m5696l(new C0117cw(i2, componentCallbacksC0077bw));
        componentCallbacksC0077bw.f4623y = this.f2399a;
    }

    /* JADX INFO: renamed from: e */
    public final void m2018e(String str, PrintWriter printWriter) {
        m2019f(str, printWriter, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m2019f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9934l);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2401c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2400b);
            if (this.f9931i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9931i));
            }
            if (this.f9927e != 0 || this.f9928f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9927e));
                printWriter.print(gBCSQzBeB.KAOPfRNcwA);
                printWriter.println(Integer.toHexString(this.f9928f));
            }
            if (this.f9929g != 0 || this.f9930h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9929g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9930h));
            }
            if (this.f9935m != 0 || this.f9936n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9935m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9936n);
            }
            if (this.f9937o != 0 || this.f9938p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9937o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9938p);
            }
        }
        if (this.f9926d.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f9926d.size();
        for (int i = 0; i < size; i++) {
            C0117cw c0117cw = (C0117cw) this.f9926d.get(i);
            switch (c0117cw.f9849a) {
                case 0:
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
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
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
                    str2 = "cmd=" + c0117cw.f9849a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0117cw.f9850b);
            if (z) {
                if (c0117cw.f9852d != 0 || c0117cw.f9853e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0117cw.f9852d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0117cw.f9853e));
                }
                if (c0117cw.f9854f != 0 || c0117cw.f9855g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0117cw.f9854f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0117cw.f9855g));
                }
            }
        }
    }

    @Override // p000.InterfaceC0096co
    /* JADX INFO: renamed from: g */
    public final boolean mo2020g(ArrayList arrayList, ArrayList arrayList2) {
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(TVkaNXnfP.kAzSLPuLjsFo);
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f9932j) {
            return true;
        }
        C0111cq c0111cq = this.f2399a;
        if (c0111cq.f8782b == null) {
            c0111cq.f8782b = new ArrayList();
        }
        c0111cq.f8782b.add(this);
        return true;
    }

    @Override // p000.AbstractC0118cx
    /* JADX INFO: renamed from: h */
    public final void mo2021h() {
        m2023j(false);
    }

    @Override // p000.AbstractC0118cx
    /* JADX INFO: renamed from: i */
    public final void mo2022i() {
        m2023j(true);
    }

    /* JADX INFO: renamed from: j */
    final void m2023j(boolean z) {
        if (this.f2400b) {
            throw new IllegalStateException("commit already called");
        }
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new C0129dh());
            m2018e("  ", printWriter);
            printWriter.close();
        }
        this.f2400b = true;
        if (this.f9932j) {
            this.f2401c = this.f2399a.f8786f.getAndIncrement();
        } else {
            this.f2401c = -1;
        }
        this.f2399a.m5296D(this, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2401c >= 0) {
            sb.append(" #");
            sb.append(this.f2401c);
        }
        if (this.f9934l != null) {
            sb.append(" ");
            sb.append(this.f9934l);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // p000.AbstractC0118cx
    /* JADX INFO: renamed from: k */
    public final void mo2024k(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        C0111cq c0111cq = componentCallbacksC0077bw.f4623y;
        if (c0111cq == null || c0111cq == this.f2399a) {
            m5696l(new C0117cw(3, componentCallbacksC0077bw));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC0077bw.toString() + " is already attached to a FragmentManager.");
    }
}
