package p447w3;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import androidx.view.AbstractC1036h0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1056v;
import androidx.view.InterfaceC1051q;
import androidx.view.InterfaceC1057w;
import androidx.view.LiveData;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.kochava.tracker.BuildConfig;
import java.io.PrintWriter;
import p070db.C5125e;
import p070db.C5141u;
import p326q.C8453i;
import p338qd.C8573r0;
import p472x3.AbstractC10073a;
import p472x3.C10074b;

/* JADX INFO: renamed from: w3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9809b extends AbstractC9808a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1051q f49927a;

    /* JADX INFO: renamed from: b */
    public final c f49928b;

    /* JADX INFO: renamed from: w3.b$a */
    public static class a<D> extends C1056v<D> implements C10074b.a<D> {

        /* JADX INFO: renamed from: n */
        public final C10074b<D> f49931n;

        /* JADX INFO: renamed from: o */
        public InterfaceC1051q f49932o;

        /* JADX INFO: renamed from: p */
        public b<D> f49933p;

        /* JADX INFO: renamed from: l */
        public final int f49929l = 0;

        /* JADX INFO: renamed from: m */
        public final Bundle f49930m = null;

        /* JADX INFO: renamed from: q */
        public C10074b<D> f49934q = null;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a(C5125e c5125e) {
            this.f49931n = c5125e;
            if (c5125e.f51123b != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            c5125e.f51123b = this;
            c5125e.f51122a = 0;
        }

        @Override // androidx.view.LiveData
        /* JADX INFO: renamed from: f */
        public final void mo3897f() {
            C10074b<D> c10074b = this.f49931n;
            c10074b.f51124c = true;
            c10074b.f51126e = false;
            c10074b.f51125d = false;
            C5125e c5125e = (C5125e) c10074b;
            c5125e.f33111j.drainPermits();
            c5125e.m18918b();
            c5125e.f51118h = new AbstractC10073a.a();
            c5125e.m18916c();
        }

        @Override // androidx.view.LiveData
        /* JADX INFO: renamed from: g */
        public final void mo3898g() {
            this.f49931n.f51124c = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.LiveData
        /* JADX INFO: renamed from: h */
        public final void mo3899h(InterfaceC1057w<? super D> interfaceC1057w) {
            super.mo3899h(interfaceC1057w);
            this.f49932o = null;
            this.f49933p = null;
        }

        @Override // androidx.view.C1056v, androidx.view.LiveData
        /* JADX INFO: renamed from: i */
        public final void mo3900i(D d10) {
            super.mo3900i(d10);
            C10074b<D> c10074b = this.f49934q;
            if (c10074b != null) {
                c10074b.f51126e = true;
                c10074b.f51124c = false;
                c10074b.f51125d = false;
                c10074b.f51127f = false;
                this.f49934q = null;
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m18290k() {
            InterfaceC1051q interfaceC1051q = this.f49932o;
            b<D> bVar = this.f49933p;
            if (interfaceC1051q == null || bVar == null) {
                return;
            }
            super.mo3899h(bVar);
            m3895d(interfaceC1051q, bVar);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f49929l);
            sb2.append(" : ");
            C8573r0.m16671F(this.f49931n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: w3.b$b */
    public static class b<D> implements InterfaceC1057w<D> {

        /* JADX INFO: renamed from: a */
        public final AbstractC9808a.a<D> f49935a;

        /* JADX INFO: renamed from: b */
        public boolean f49936b = false;

        public b(C10074b c10074b, C5141u c5141u) {
            this.f49935a = c5141u;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC1057w
        /* JADX INFO: renamed from: b */
        public final void mo3773b(D d10) {
            C5141u c5141u = (C5141u) this.f49935a;
            c5141u.getClass();
            SignInHubActivity signInHubActivity = c5141u.f33120a;
            signInHubActivity.setResult(signInHubActivity.f13851V, signInHubActivity.f13852W);
            signInHubActivity.finish();
            this.f49936b = true;
        }

        public final String toString() {
            return this.f49935a.toString();
        }
    }

    /* JADX INFO: renamed from: w3.b$c */
    public static class c extends AbstractC1036h0 {

        /* JADX INFO: renamed from: f */
        public static final a f49937f = new a();

        /* JADX INFO: renamed from: d */
        public final C8453i<a> f49938d = new C8453i<>();

        /* JADX INFO: renamed from: e */
        public boolean f49939e = false;

        /* JADX INFO: renamed from: w3.b$c$a */
        public static class a implements C1042k0.b {
            @Override // androidx.view.C1042k0.b
            /* JADX INFO: renamed from: b */
            public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
                return new c();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.view.AbstractC1036h0
        /* JADX INFO: renamed from: j2 */
        public final void mo3725j2() {
            C8453i<a> c8453i = this.f49938d;
            int iM16537h = c8453i.m16537h();
            for (int i10 = 0; i10 < iM16537h; i10++) {
                a aVarM16538i = c8453i.m16538i(i10);
                C10074b<D> c10074b = aVarM16538i.f49931n;
                c10074b.m18918b();
                c10074b.f51125d = true;
                b<D> bVar = aVarM16538i.f49933p;
                if (bVar != 0) {
                    aVarM16538i.mo3899h(bVar);
                    if (bVar.f49936b) {
                        bVar.f49935a.getClass();
                    }
                }
                Object obj = c10074b.f51123b;
                if (obj == null) {
                    throw new IllegalStateException("No listener register");
                }
                if (obj != aVarM16538i) {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
                c10074b.f51123b = null;
                c10074b.f51126e = true;
                c10074b.f51124c = false;
                c10074b.f51125d = false;
                c10074b.f51127f = false;
            }
            int i11 = c8453i.f45624d;
            Object[] objArr = c8453i.f45623c;
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = null;
            }
            c8453i.f45624d = 0;
            c8453i.f45621a = false;
        }
    }

    public C9809b(InterfaceC1051q interfaceC1051q, C1046m0 c1046m0) {
        this.f49927a = interfaceC1051q;
        this.f49928b = (c) new C1042k0(c1046m0, c.f49937f).m3947a(c.class);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public final void m18289b(String str, PrintWriter printWriter) {
        c cVar = this.f49928b;
        if (cVar.f49938d.m16537h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < cVar.f49938d.m16537h(); i10++) {
                a aVarM16538i = cVar.f49938d.m16538i(i10);
                printWriter.print(str);
                printWriter.print("  #");
                C8453i<a> c8453i = cVar.f49938d;
                if (c8453i.f45621a) {
                    c8453i.m16534e();
                }
                printWriter.print(c8453i.f45622b[i10]);
                printWriter.print(": ");
                printWriter.println(aVarM16538i.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(aVarM16538i.f49929l);
                printWriter.print(" mArgs=");
                printWriter.println(aVarM16538i.f49930m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(aVarM16538i.f49931n);
                Object obj = aVarM16538i.f49931n;
                String strM765k = C0166e.m765k(str2, "  ");
                AbstractC10073a abstractC10073a = (AbstractC10073a) obj;
                abstractC10073a.getClass();
                printWriter.print(strM765k);
                printWriter.print("mId=");
                printWriter.print(abstractC10073a.f51122a);
                printWriter.print(" mListener=");
                printWriter.println(abstractC10073a.f51123b);
                if (abstractC10073a.f51124c || abstractC10073a.f51127f) {
                    printWriter.print(strM765k);
                    printWriter.print("mStarted=");
                    printWriter.print(abstractC10073a.f51124c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(abstractC10073a.f51127f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (abstractC10073a.f51125d || abstractC10073a.f51126e) {
                    printWriter.print(strM765k);
                    printWriter.print("mAbandoned=");
                    printWriter.print(abstractC10073a.f51125d);
                    printWriter.print(" mReset=");
                    printWriter.println(abstractC10073a.f51126e);
                }
                if (abstractC10073a.f51118h != null) {
                    printWriter.print(strM765k);
                    printWriter.print("mTask=");
                    printWriter.print(abstractC10073a.f51118h);
                    printWriter.print(" waiting=");
                    abstractC10073a.f51118h.getClass();
                    printWriter.println(false);
                }
                if (abstractC10073a.f51119i != null) {
                    printWriter.print(strM765k);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(abstractC10073a.f51119i);
                    printWriter.print(" waiting=");
                    abstractC10073a.f51119i.getClass();
                    printWriter.println(false);
                }
                if (aVarM16538i.f49933p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVarM16538i.f49933p);
                    b<D> bVar = aVarM16538i.f49933p;
                    bVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f49936b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object obj2 = aVarM16538i.f49931n;
                Object obj3 = aVarM16538i.f6536e;
                if (obj3 == LiveData.f6531k) {
                    obj3 = null;
                }
                obj2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                C8573r0.m16671F(obj3, sb2);
                sb2.append("}");
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVarM16538i.f6534c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(BuildConfig.SDK_TRUNCATE_LENGTH);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C8573r0.m16671F(this.f49927a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
