package p000;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aie {

    /* JADX INFO: renamed from: a */
    public final Object f426a;

    /* JADX INFO: renamed from: b */
    public final Object f427b;

    public aie() {
        this.f426a = Choreographer.getInstance();
        this.f427b = Looper.myLooper();
    }

    public aie(int i, int i2) {
        this.f426a = new int[]{i, i2};
        this.f427b = new float[]{0.0f, 1.0f};
    }

    public aie(int i, int i2, int i3) {
        this.f426a = new int[]{i, i2, i3};
        this.f427b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public aie(TextView textView) {
        this.f426a = textView;
        this.f427b = new bkn(textView);
    }

    public aie(bkn bknVar, Handler handler, byte[] bArr, byte[] bArr2) {
        this.f426a = bknVar;
        this.f427b = handler;
    }

    public aie(String str) {
        this.f426a = new HashMap();
        this.f427b = str;
    }

    public aie(List list, List list2) {
        int size = list.size();
        this.f426a = new int[size];
        this.f427b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f426a)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.f427b)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public aie(InterfaceC0862nu interfaceC0862nu) {
        this.f427b = interfaceC0862nu;
        this.f426a = new iyg(null);
    }

    public aie(InterfaceC0918pw interfaceC0918pw, AbstractC0927qe abstractC0927qe) {
        this.f426a = interfaceC0918pw;
        this.f427b = abstractC0927qe;
    }

    public aie(byte[] bArr) {
        this.f427b = new C1117xf();
        this.f426a = new C1114xc();
    }

    /* JADX INFO: renamed from: a */
    public final void m756a(Runnable runnable) {
        ((Choreographer) this.f426a).postFrameCallback(new cij(runnable, 1));
    }

    /* JADX INFO: renamed from: b */
    public final File m757b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) ((HashMap) this.f426a).get(strDecode);
        if (file == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find configured root for ");
            sb.append(uri);
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (canonicalFile.getPath().startsWith(file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to resolve canonical path for ");
            sb2.append(file2);
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m758c(C0829mo c0829mo) {
        C0863nv c0863nvM17741a = (C0863nv) ((C1117xf) this.f427b).get(c0829mo);
        if (c0863nvM17741a == null) {
            c0863nvM17741a = C0863nv.m17741a();
            ((C1117xf) this.f427b).put(c0829mo, c0863nvM17741a);
        }
        c0863nvM17741a.f44723b |= 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m759d(long j, C0829mo c0829mo) {
        ((C1114xc) this.f426a).m19549g(j, c0829mo);
    }

    /* JADX INFO: renamed from: e */
    public final void m760e() {
        ((C1117xf) this.f427b).clear();
        ((C1114xc) this.f426a).m19548f();
    }

    /* JADX INFO: renamed from: f */
    public final void m761f(C0829mo c0829mo) {
        C0863nv c0863nv = (C0863nv) ((C1117xf) this.f427b).get(c0829mo);
        if (c0863nv == null) {
            return;
        }
        c0863nv.f44723b &= -2;
    }

    /* JADX INFO: renamed from: g */
    public final void m762g(C0829mo c0829mo) {
        for (int iM19544b = ((C1114xc) this.f426a).m19544b() - 1; iM19544b >= 0; iM19544b--) {
            if (c0829mo == ((C1114xc) this.f426a).m19547e(iM19544b)) {
                C1114xc c1114xc = (C1114xc) this.f426a;
                Object[] objArr = c1114xc.f47991c;
                Object obj = objArr[iM19544b];
                Object obj2 = C1115xd.f47993a;
                if (obj == obj2) {
                    break;
                }
                objArr[iM19544b] = obj2;
                c1114xc.f47989a = true;
                break;
            }
        }
        C0863nv c0863nv = (C0863nv) ((C1117xf) this.f427b).remove(c0829mo);
        if (c0863nv != null) {
            C0863nv.m17742b(c0863nv);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m763h(C0829mo c0829mo) {
        C0863nv c0863nv = (C0863nv) ((C1117xf) this.f427b).get(c0829mo);
        return (c0863nv == null || (c0863nv.f44723b & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final aev m764i(C0829mo c0829mo, int i) {
        C0863nv c0863nv;
        aev aevVar;
        int iM19558c = ((C1117xf) this.f427b).m19558c(c0829mo);
        if (iM19558c >= 0 && (c0863nv = (C0863nv) ((C1117xf) this.f427b).m19560g(iM19558c)) != null) {
            int i2 = c0863nv.f44723b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                c0863nv.f44723b = i3;
                if (i == 4) {
                    aevVar = c0863nv.f44724c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    aevVar = c0863nv.f44725d;
                }
                if ((i3 & 12) == 0) {
                    ((C1117xf) this.f427b).mo3366e(iM19558c);
                    C0863nv.m17742b(c0863nv);
                }
                return aevVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m765j(C0829mo c0829mo, aev aevVar) {
        C0863nv c0863nvM17741a = (C0863nv) ((C1117xf) this.f427b).get(c0829mo);
        if (c0863nvM17741a == null) {
            c0863nvM17741a = C0863nv.m17741a();
            ((C1117xf) this.f427b).put(c0829mo, c0863nvM17741a);
        }
        c0863nvM17741a.f44725d = aevVar;
        c0863nvM17741a.f44723b |= 8;
    }

    /* JADX INFO: renamed from: k */
    public final void m766k(C0829mo c0829mo, aev aevVar) {
        C0863nv c0863nvM17741a = (C0863nv) ((C1117xf) this.f427b).get(c0829mo);
        if (c0863nvM17741a == null) {
            c0863nvM17741a = C0863nv.m17741a();
            ((C1117xf) this.f427b).put(c0829mo, c0863nvM17741a);
        }
        c0863nvM17741a.f44724c = aevVar;
        c0863nvM17741a.f44723b |= 4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nu] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nu] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, nu] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, nu] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, nu] */
    /* JADX INFO: renamed from: l */
    public final View m767l(int i, int i2, int i3, int i4) {
        int iMo16100d = this.f427b.mo16100d();
        int iMo16099c = this.f427b.mo16099c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View viewMo16101e = this.f427b.mo16101e(i5);
            ((iyg) this.f426a).m11904d(iMo16100d, iMo16099c, this.f427b.mo16098b(viewMo16101e), this.f427b.mo16097a(viewMo16101e));
            ((iyg) this.f426a).m11903c();
            ((iyg) this.f426a).m11902b(i3);
            iyg iygVar = (iyg) this.f426a;
            if (iygVar.m11905e()) {
                return viewMo16101e;
            }
            iygVar.m11903c();
            ((iyg) this.f426a).m11902b(i4);
            int i6 = 1;
            if (true == ((iyg) this.f426a).m11905e()) {
                view = viewMo16101e;
            }
            if (i2 <= i) {
                i6 = -1;
            }
            i5 += i6;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nu] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nu] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, nu] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, nu] */
    /* JADX INFO: renamed from: m */
    public final boolean m768m(View view) {
        ((iyg) this.f426a).m11904d(this.f427b.mo16100d(), this.f427b.mo16099c(), this.f427b.mo16098b(view), this.f427b.mo16097a(view));
        ((iyg) this.f426a).m11903c();
        ((iyg) this.f426a).m11902b(24579);
        return ((iyg) this.f426a).m11905e();
    }

    /* JADX INFO: renamed from: n */
    public final void m769n(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((TextView) this.f426a).getContext().obtainStyledAttributes(attributeSet, C0193fr.f23265i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            Object obj = ((bkn) this.f427b).f3651a;
            ajf.m803d();
            ((ajf) obj).f487a.f486a = z;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m770o(kym kymVar) {
        if (kymVar.f37733a != 0) {
            Object obj = this.f426a;
            ((Handler) this.f427b).post(new RunnableC0852nk((bkn) obj, 10, null, null));
            return;
        }
        Object obj2 = kymVar.f37734b;
        Object obj3 = this.f426a;
        ((Handler) this.f427b).post(new RunnableC0058bd((bkn) obj3, (Typeface) obj2, 10, null, null));
    }
}
