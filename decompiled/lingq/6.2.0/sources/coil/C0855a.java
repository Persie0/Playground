package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.intercept.C0862a;
import coil.request.C0864a;
import coil.request.NullRequestDataException;
import coil.util.AbstractC0865a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import p000.AbstractC2983f;
import p000.AbstractC3057h;
import p000.AbstractC3572sf;
import p000.C0826bw;
import p000.C3386nv;
import p000.am6;
import p000.bd1;
import p000.c78;
import p000.cb3;
import p000.cd0;
import p000.cd4;
import p000.cs4;
import p000.cx3;
import p000.d04;
import p000.dp5;
import p000.e04;
import p000.eaa;
import p000.eh0;
import p000.ex3;
import p000.f04;
import p000.fs6;
import p000.hn9;
import p000.i99;
import p000.jja;
import p000.kt2;
import p000.l70;
import p000.lp9;
import p000.lr9;
import p000.m18;
import p000.my5;
import p000.nn1;
import p000.nn9;
import p000.o33;
import p000.p84;
import p000.ph2;
import p000.pk0;
import p000.r46;
import p000.s72;
import p000.saa;
import p000.t04;
import p000.u91;
import p000.v72;
import p000.vl1;
import p000.vz1;
import p000.w41;
import p000.w89;
import p000.wfb;
import p000.wt2;
import p000.xh2;
import p000.xz3;
import p000.z90;

/* JADX INFO: renamed from: coil.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0855a {

    /* JADX INFO: renamed from: a */
    public final Context f10404a;

    /* JADX INFO: renamed from: b */
    public final s72 f10405b;

    /* JADX INFO: renamed from: c */
    public final cs4 f10406c;

    /* JADX INFO: renamed from: d */
    public final xz3 f10407d;

    /* JADX INFO: renamed from: e */
    public final vl1 f10408e;

    /* JADX INFO: renamed from: f */
    public final fs6 f10409f;

    /* JADX INFO: renamed from: g */
    public final bd1 f10410g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f10411h;

    public C0855a(Context context, s72 s72Var, cs4 cs4Var, cs4 cs4Var2, cs4 cs4Var3, bd1 bd1Var, xz3 xz3Var) {
        this.f10404a = context;
        this.f10405b = s72Var;
        this.f10406c = cs4Var;
        this.f10407d = xz3Var;
        nn9 nn9VarM20384i = r46.m20384i();
        v72 v72Var = ph2.f56212a;
        this.f10408e = vz1.m23619a(eh0.m11113J(nn9VarM20384i, dp5.f36000a.f68538f).plus(new cb3(this)));
        lp9 lp9Var = new lp9(this);
        fs6 fs6Var = new fs6(14, this, lp9Var);
        this.f10409f = fs6Var;
        w41 w41Var = new w41();
        w41Var.f66365a = u91.m22624p1(bd1Var.f8359a);
        w41Var.f66366b = u91.m22624p1(bd1Var.f8360b);
        w41Var.f66367c = u91.m22624p1(bd1Var.f8361c);
        w41Var.f66368d = u91.m22624p1(bd1Var.f8362d);
        w41Var.f66369e = u91.m22624p1(bd1Var.f8363e);
        w41Var.m23720g(new pk0(2), ex3.class);
        int i = 5;
        w41Var.m23720g(new pk0(i), String.class);
        w41Var.m23720g(new pk0(1), Uri.class);
        int i2 = 4;
        w41Var.m23720g(new pk0(i2), Uri.class);
        int i3 = 3;
        w41Var.m23720g(new pk0(i3), Integer.class);
        int i4 = 0;
        w41Var.m23720g(new pk0(i4), byte[].class);
        jja jjaVar = new jja();
        ArrayList arrayList = (ArrayList) w41Var.f66367c;
        arrayList.add(new Pair(jjaVar, Uri.class));
        arrayList.add(new Pair(new o33(xz3Var.f68984a), File.class));
        w41Var.m23721h(new cx3(cs4Var3, cs4Var2, xz3Var.f68986c), Uri.class);
        w41Var.m23721h(new C0826bw(i), File.class);
        w41Var.m23721h(new C0826bw(i4), Uri.class);
        w41Var.m23721h(new C0826bw(i3), Uri.class);
        w41Var.m23721h(new C0826bw(6), Uri.class);
        w41Var.m23721h(new C0826bw(i2), Drawable.class);
        w41Var.m23721h(new C0826bw(1), Bitmap.class);
        w41Var.m23721h(new C0826bw(2), ByteBuffer.class);
        cd0 cd0Var = new cd0(xz3Var.f68987d, xz3Var.f68988e);
        ArrayList arrayList2 = (ArrayList) w41Var.f66369e;
        arrayList2.add(cd0Var);
        List listM15918I = l70.m15918I((ArrayList) w41Var.f66365a);
        this.f10410g = new bd1(listM15918I, l70.m15918I((ArrayList) w41Var.f66366b), l70.m15918I(arrayList), l70.m15918I((ArrayList) w41Var.f66368d), l70.m15918I(arrayList2));
        this.f10411h = u91.m22604V0(listM15918I, new C0862a(this, lp9Var, fs6Var));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x00d8, PHI: r1 r2 r3 r4
      0x00db: PHI (r1v14 coil.a) = (r1v3 coil.a), (r1v15 coil.a), (r1v16 coil.a) binds: [B:28:0x0073, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r2v17 wt2) = (r2v5 wt2), (r2v29 wt2), (r2v30 wt2) binds: [B:28:0x0073, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r3v10 e04) = (r3v19 e04), (r3v20 e04), (r3v21 e04) binds: [B:28:0x0073, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r4v10 c78) = (r4v12 c78), (r4v13 c78), (r4v14 c78) binds: [B:28:0x0073, B:38:0x00c3, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x00d8, blocks: (B:44:0x00db, B:46:0x00e5, B:47:0x00e8, B:49:0x00f7, B:50:0x00fa, B:35:0x00ba, B:37:0x00c0, B:39:0x00c5, B:86:0x019d, B:87:0x01a4), top: B:104:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[Catch: all -> 0x00d8, TryCatch #3 {all -> 0x00d8, blocks: (B:44:0x00db, B:46:0x00e5, B:47:0x00e8, B:49:0x00f7, B:50:0x00fa, B:35:0x00ba, B:37:0x00c0, B:39:0x00c5, B:86:0x019d, B:87:0x01a4), top: B:104:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7 A[Catch: all -> 0x00d8, TryCatch #3 {all -> 0x00d8, blocks: (B:44:0x00db, B:46:0x00e5, B:47:0x00e8, B:49:0x00f7, B:50:0x00fa, B:35:0x00ba, B:37:0x00c0, B:39:0x00c5, B:86:0x019d, B:87:0x01a4), top: B:104:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147 A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:60:0x0141, B:62:0x0147, B:65:0x0159, B:70:0x0171, B:66:0x015d, B:69:0x016b, B:75:0x017d, B:77:0x0181, B:80:0x0190, B:81:0x0195), top: B:108:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0159 A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:60:0x0141, B:62:0x0147, B:65:0x0159, B:70:0x0171, B:66:0x015d, B:69:0x016b, B:75:0x017d, B:77:0x0181, B:80:0x0190, B:81:0x0195), top: B:108:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015d A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:60:0x0141, B:62:0x0147, B:65:0x0159, B:70:0x0171, B:66:0x015d, B:69:0x016b, B:75:0x017d, B:77:0x0181, B:80:0x0190, B:81:0x0195), top: B:108:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:60:0x0141, B:62:0x0147, B:65:0x0159, B:70:0x0171, B:66:0x015d, B:69:0x016b, B:75:0x017d, B:77:0x0181, B:80:0x0190, B:81:0x0195), top: B:108:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017d A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:60:0x0141, B:62:0x0147, B:65:0x0159, B:70:0x0171, B:66:0x015d, B:69:0x016b, B:75:0x017d, B:77:0x0181, B:80:0x0190, B:81:0x0195), top: B:108:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0181 A[Catch: all -> 0x017b, TRY_LEAVE, TryCatch #6 {all -> 0x017b, blocks: (B:60:0x0141, B:62:0x0147, B:65:0x0159, B:70:0x0171, B:66:0x015d, B:69:0x016b, B:75:0x017d, B:77:0x0181, B:80:0x0190, B:81:0x0195), top: B:108:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0190 A[Catch: all -> 0x017b, TRY_ENTER, TryCatch #6 {all -> 0x017b, blocks: (B:60:0x0141, B:62:0x0147, B:65:0x0159, B:70:0x0171, B:66:0x015d, B:69:0x016b, B:75:0x017d, B:77:0x0181, B:80:0x0190, B:81:0x0195), top: B:108:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a9 A[Catch: all -> 0x01bb, TRY_LEAVE, TryCatch #5 {all -> 0x01bb, blocks: (B:88:0x01a5, B:90:0x01a9, B:95:0x01bd, B:96:0x01c6), top: B:107:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd A[Catch: all -> 0x01bb, TRY_ENTER, TryCatch #5 {all -> 0x01bb, blocks: (B:88:0x01a5, B:90:0x01a9, B:95:0x01bd, B:96:0x01c6), top: B:107:0x01a5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [coil.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, wt2] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [e04, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [c78] */
    /* JADX INFO: renamed from: a */
    public static final Object m4949a(C0855a c0855a, e04 e04Var, int i, ContinuationImpl continuationImpl) throws Throwable {
        RealImageLoader$executeMain$1 realImageLoader$executeMain$1;
        ?? r2;
        ?? r1;
        wt2 wt2Var;
        C0855a c0855a2;
        ?? r3;
        ?? r4;
        Bitmap bitmap;
        wt2 wt2Var2;
        e04 e04Var2;
        c78 c78Var;
        C0855a c0855a3;
        C0855a c0855a4;
        C0855a c0855a5;
        c78 c78Var2;
        e04 e04Var3;
        wt2 wt2Var3;
        c78 c78Var3;
        e04 e04Var4;
        wt2 wt2Var4;
        f04 f04Var;
        hn9 hn9Var;
        lr9 lr9Var;
        e04 e04Var5;
        Drawable drawable;
        eaa eaaVarM25690a;
        wt2 wt2Var5;
        Object objM23905G;
        c78 c78Var4;
        e04 e04Var6;
        Drawable drawableM11407b;
        lr9 lr9Var2;
        Object objMo11204h;
        c78 c0864a;
        e04 e04VarM9960a;
        wt2 wt2Var6;
        C0855a c0855a6 = c0855a;
        e04 e04Var7 = e04Var;
        if (continuationImpl instanceof RealImageLoader$executeMain$1) {
            realImageLoader$executeMain$1 = (RealImageLoader$executeMain$1) continuationImpl;
            int i2 = realImageLoader$executeMain$1.f10397h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realImageLoader$executeMain$1.f10397h = i2 - Integer.MIN_VALUE;
            } else {
                realImageLoader$executeMain$1 = new RealImageLoader$executeMain$1(c0855a6, continuationImpl);
            }
        } else {
            realImageLoader$executeMain$1 = new RealImageLoader$executeMain$1(c0855a6, continuationImpl);
        }
        RealImageLoader$executeMain$1 realImageLoader$executeMain$2 = realImageLoader$executeMain$1;
        Object obj = realImageLoader$executeMain$2.f10395f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = realImageLoader$executeMain$2.f10397h;
        if (i3 != 0) {
            try {
                if (i3 == 1) {
                    wt2 wt2Var7 = realImageLoader$executeMain$2.f10393d;
                    e04 e04Var8 = realImageLoader$executeMain$2.f10392c;
                    c78 c78Var5 = realImageLoader$executeMain$2.f10391b;
                    C0855a c0855a7 = realImageLoader$executeMain$2.f10390a;
                    AbstractC3193b.m15359b(obj);
                    wt2Var = wt2Var7;
                    c0855a2 = c0855a7;
                    e04Var6 = e04Var8;
                    c78Var4 = c78Var5;
                    c0855a2 = c0855a6;
                    wt2Var = wt2Var6;
                    e04Var6 = e04VarM9960a;
                    c78Var4 = c0864a;
                    c0855a2 = c0855a6;
                    wt2Var = wt2Var6;
                    e04Var6 = e04VarM9960a;
                    c78Var4 = c0864a;
                    c0855a2 = c0855a6;
                    wt2Var = wt2Var6;
                    e04Var6 = e04VarM9960a;
                    c78Var4 = c0864a;
                    if (((m18) c0855a2.f10406c.getValue()) != null) {
                        e04Var6.getClass();
                    }
                    Integer num = e04Var6.f36526y;
                    e04Var6.f36501A.getClass();
                    drawableM11407b = AbstractC2983f.m11407b(e04Var6, num);
                    lr9Var2 = e04Var6.f36504c;
                    if (lr9Var2 != null) {
                        lr9Var2.mo11814u(drawableM11407b);
                    }
                    wt2Var.getClass();
                    i99 i99Var = e04Var6.f36523v;
                    realImageLoader$executeMain$2.f10390a = c0855a2;
                    realImageLoader$executeMain$2.f10391b = c78Var4;
                    realImageLoader$executeMain$2.f10392c = e04Var6;
                    realImageLoader$executeMain$2.f10393d = wt2Var;
                    realImageLoader$executeMain$2.f10394e = null;
                    realImageLoader$executeMain$2.f10397h = 2;
                    objMo11204h = i99Var.mo11204h(realImageLoader$executeMain$2);
                    if (objMo11204h != coroutineSingletons) {
                        c0855a3 = c0855a2;
                        wt2Var2 = wt2Var;
                        e04Var2 = e04Var6;
                        obj = objMo11204h;
                        bitmap = null;
                        c78Var = c78Var4;
                        wt2Var2.getClass();
                        nn1 nn1Var = e04Var2.f36518q;
                        RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new RealImageLoader$executeMain$result$1(e04Var2, c0855a3, (w89) obj, wt2Var2, bitmap, null);
                        wt2Var5 = wt2Var2;
                        realImageLoader$executeMain$2.f10390a = c0855a3;
                        realImageLoader$executeMain$2.f10391b = c78Var;
                        realImageLoader$executeMain$2.f10392c = e04Var2;
                        realImageLoader$executeMain$2.f10393d = wt2Var5;
                        realImageLoader$executeMain$2.f10394e = null;
                        realImageLoader$executeMain$2.f10397h = 3;
                        objM23905G = wfb.m23905G(realImageLoader$executeMain$result$1, nn1Var, realImageLoader$executeMain$2);
                        if (objM23905G != coroutineSingletons) {
                            wt2Var4 = wt2Var5;
                            e04Var4 = e04Var2;
                            obj = objM23905G;
                            c78Var3 = c78Var;
                            c0855a4 = c0855a3;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i3 == 2) {
                    Bitmap bitmap2 = realImageLoader$executeMain$2.f10394e;
                    wt2 wt2Var8 = realImageLoader$executeMain$2.f10393d;
                    e04 e04Var9 = realImageLoader$executeMain$2.f10392c;
                    c78 c78Var6 = realImageLoader$executeMain$2.f10391b;
                    C0855a c0855a8 = realImageLoader$executeMain$2.f10390a;
                    try {
                        AbstractC3193b.m15359b(obj);
                        bitmap = bitmap2;
                        wt2Var2 = wt2Var8;
                        e04Var2 = e04Var9;
                        c78Var = c78Var6;
                        c0855a3 = c0855a8;
                        try {
                            wt2Var2.getClass();
                            nn1 nn1Var2 = e04Var2.f36518q;
                            RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$2 = new RealImageLoader$executeMain$result$1(e04Var2, c0855a3, (w89) obj, wt2Var2, bitmap, null);
                            wt2Var5 = wt2Var2;
                            try {
                                realImageLoader$executeMain$2.f10390a = c0855a3;
                                realImageLoader$executeMain$2.f10391b = c78Var;
                                realImageLoader$executeMain$2.f10392c = e04Var2;
                                realImageLoader$executeMain$2.f10393d = wt2Var5;
                                realImageLoader$executeMain$2.f10394e = null;
                                realImageLoader$executeMain$2.f10397h = 3;
                                objM23905G = wfb.m23905G(realImageLoader$executeMain$result$2, nn1Var2, realImageLoader$executeMain$2);
                                if (objM23905G != coroutineSingletons) {
                                    wt2Var4 = wt2Var5;
                                    e04Var4 = e04Var2;
                                    obj = objM23905G;
                                    c78Var3 = c78Var;
                                    c0855a4 = c0855a3;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th) {
                                th = th;
                                e04Var3 = e04Var2;
                                wt2Var3 = wt2Var5;
                                c78Var2 = c78Var;
                                c0855a5 = c0855a3;
                                r1 = c0855a5;
                                r2 = wt2Var3;
                                r3 = e04Var3;
                                r4 = c78Var2;
                                if (th instanceof CancellationException) {
                                    r1.getClass();
                                    r2.getClass();
                                    r3.getClass();
                                    throw th;
                                }
                                r1.f10409f.getClass();
                                kt2 kt2VarM12087r = fs6.m12087r(r3, th);
                                m4950d(kt2VarM12087r, r3.f36504c, r2);
                                r4.mo4395q();
                                return kt2VarM12087r;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            wt2Var5 = wt2Var2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = wt2Var8;
                        r3 = e04Var9;
                        r4 = c78Var6;
                        r1 = c0855a8;
                    }
                } else {
                    if (i3 != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wt2 wt2Var9 = realImageLoader$executeMain$2.f10393d;
                    e04 e04Var10 = realImageLoader$executeMain$2.f10392c;
                    c78 c78Var7 = realImageLoader$executeMain$2.f10391b;
                    C0855a c0855a9 = realImageLoader$executeMain$2.f10390a;
                    AbstractC3193b.m15359b(obj);
                    c0855a4 = c0855a9;
                    wt2Var4 = wt2Var9;
                    e04Var4 = e04Var10;
                    c78Var3 = c78Var7;
                }
                try {
                    f04Var = (f04) obj;
                    if (f04Var instanceof hn9) {
                        hn9Var = (hn9) f04Var;
                        lr9Var = e04Var4.f36504c;
                        c0855a4.getClass();
                        e04Var5 = hn9Var.f42664b;
                        drawable = hn9Var.f42663a;
                        if (lr9Var instanceof saa) {
                            eaaVarM25690a = e04Var5.f36508g.m25690a((saa) lr9Var, hn9Var);
                            if (eaaVarM25690a instanceof am6) {
                                lr9Var.mo11812p(drawable);
                            } else {
                                wt2Var4.getClass();
                                eaaVarM25690a.mo557a();
                            }
                        } else if (lr9Var != null) {
                            lr9Var.mo11812p(drawable);
                        }
                        wt2Var4.getClass();
                        e04Var5.getClass();
                    } else {
                        if (!(f04Var instanceof kt2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lr9 lr9Var3 = e04Var4.f36504c;
                        c0855a4.getClass();
                        m4950d((kt2) f04Var, lr9Var3, wt2Var4);
                    }
                    c78Var3.mo4395q();
                    return f04Var;
                } catch (Throwable th4) {
                    th = th4;
                    wt2Var3 = wt2Var4;
                    e04Var3 = e04Var4;
                    c78Var2 = c78Var3;
                    c0855a5 = c0855a4;
                    r1 = c0855a5;
                    r2 = wt2Var3;
                    r3 = e04Var3;
                    r4 = c78Var2;
                    if (th instanceof CancellationException) {
                        r1.getClass();
                        r2.getClass();
                        r3.getClass();
                        throw th;
                    }
                    r1.f10409f.getClass();
                    kt2 kt2VarM12087r2 = fs6.m12087r(r3, th);
                    m4950d(kt2VarM12087r2, r3.f36504c, r2);
                    r4.mo4395q();
                    return kt2VarM12087r2;
                }
            } catch (Throwable th5) {
                th = th5;
                r2 = c0855a6;
                r1 = -2147483648;
                r3 = i3;
                r4 = e04Var7;
            }
        } else {
            AbstractC3193b.m15359b(obj);
            fs6 fs6Var = c0855a6.f10409f;
            cd4 cd4VarM15441h = AbstractC3208a.m15441h(realImageLoader$executeMain$2.getContext());
            fs6Var.getClass();
            AbstractC3572sf abstractC3572sf = e04Var7.f36522u;
            lr9 lr9Var4 = e04Var7.f36504c;
            c0864a = lr9Var4 instanceof t04 ? new C0864a((C0855a) fs6Var.f39590b, e04Var7, (t04) lr9Var4, abstractC3572sf, cd4VarM15441h) : new z90(abstractC3572sf, cd4VarM15441h);
            c0864a.mo4394b();
            d04 d04VarM10778a = e04.m10778a(e04Var);
            d04VarM10778a.f34777b = c0855a6.f10405b;
            d04VarM10778a.f34795t = null;
            e04VarM9960a = d04VarM10778a.m9960a();
            wt2Var6 = wt2.f67266a;
            try {
                if (e04VarM9960a.f36503b == p84.f55746h) {
                    throw new NullRequestDataException("The request's data is null.");
                }
                c0864a.start();
                if (i == 0) {
                    AbstractC3572sf abstractC3572sf2 = e04VarM9960a.f36522u;
                    realImageLoader$executeMain$2.f10390a = c0855a6;
                    realImageLoader$executeMain$2.f10391b = c0864a;
                    realImageLoader$executeMain$2.f10392c = e04VarM9960a;
                    realImageLoader$executeMain$2.f10393d = wt2Var6;
                    realImageLoader$executeMain$2.f10397h = 1;
                    if (AbstractC0865a.m4981a(abstractC3572sf2, realImageLoader$executeMain$2) == coroutineSingletons) {
                        c0855a2 = c0855a6;
                        wt2Var = wt2Var6;
                        e04Var6 = e04VarM9960a;
                        c78Var4 = c0864a;
                        c0855a2 = c0855a6;
                        wt2Var = wt2Var6;
                        e04Var6 = e04VarM9960a;
                        c78Var4 = c0864a;
                    } else {
                        c0855a2 = c0855a6;
                        wt2Var = wt2Var6;
                        e04Var6 = e04VarM9960a;
                        c78Var4 = c0864a;
                        c0855a2 = c0855a6;
                        wt2Var = wt2Var6;
                        e04Var6 = e04VarM9960a;
                        c78Var4 = c0864a;
                        c0855a2 = c0855a6;
                        wt2Var = wt2Var6;
                        e04Var6 = e04VarM9960a;
                        c78Var4 = c0864a;
                        if (((m18) c0855a2.f10406c.getValue()) != null) {
                            e04Var6.getClass();
                        }
                        Integer num2 = e04Var6.f36526y;
                        e04Var6.f36501A.getClass();
                        drawableM11407b = AbstractC2983f.m11407b(e04Var6, num2);
                        lr9Var2 = e04Var6.f36504c;
                        if (lr9Var2 != null) {
                            lr9Var2.mo11814u(drawableM11407b);
                        }
                        wt2Var.getClass();
                        i99 i99Var2 = e04Var6.f36523v;
                        realImageLoader$executeMain$2.f10390a = c0855a2;
                        realImageLoader$executeMain$2.f10391b = c78Var4;
                        realImageLoader$executeMain$2.f10392c = e04Var6;
                        realImageLoader$executeMain$2.f10393d = wt2Var;
                        realImageLoader$executeMain$2.f10394e = null;
                        realImageLoader$executeMain$2.f10397h = 2;
                        objMo11204h = i99Var2.mo11204h(realImageLoader$executeMain$2);
                        if (objMo11204h != coroutineSingletons) {
                            c0855a3 = c0855a2;
                            wt2Var2 = wt2Var;
                            e04Var2 = e04Var6;
                            obj = objMo11204h;
                            bitmap = null;
                            c78Var = c78Var4;
                            wt2Var2.getClass();
                            nn1 nn1Var3 = e04Var2.f36518q;
                            RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$3 = new RealImageLoader$executeMain$result$1(e04Var2, c0855a3, (w89) obj, wt2Var2, bitmap, null);
                            wt2Var5 = wt2Var2;
                            realImageLoader$executeMain$2.f10390a = c0855a3;
                            realImageLoader$executeMain$2.f10391b = c78Var;
                            realImageLoader$executeMain$2.f10392c = e04Var2;
                            realImageLoader$executeMain$2.f10393d = wt2Var5;
                            realImageLoader$executeMain$2.f10394e = null;
                            realImageLoader$executeMain$2.f10397h = 3;
                            objM23905G = wfb.m23905G(realImageLoader$executeMain$result$3, nn1Var3, realImageLoader$executeMain$2);
                            if (objM23905G != coroutineSingletons) {
                                wt2Var4 = wt2Var5;
                                e04Var4 = e04Var2;
                                obj = objM23905G;
                                c78Var3 = c78Var;
                                c0855a4 = c0855a3;
                                f04Var = (f04) obj;
                                if (f04Var instanceof hn9) {
                                    hn9Var = (hn9) f04Var;
                                    lr9Var = e04Var4.f36504c;
                                    c0855a4.getClass();
                                    e04Var5 = hn9Var.f42664b;
                                    drawable = hn9Var.f42663a;
                                    if (lr9Var instanceof saa) {
                                        eaaVarM25690a = e04Var5.f36508g.m25690a((saa) lr9Var, hn9Var);
                                        if (eaaVarM25690a instanceof am6) {
                                            lr9Var.mo11812p(drawable);
                                        } else {
                                            wt2Var4.getClass();
                                            eaaVarM25690a.mo557a();
                                        }
                                    } else if (lr9Var != null) {
                                        lr9Var.mo11812p(drawable);
                                    }
                                    wt2Var4.getClass();
                                    e04Var5.getClass();
                                } else {
                                    if (!(f04Var instanceof kt2)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    lr9 lr9Var5 = e04Var4.f36504c;
                                    c0855a4.getClass();
                                    m4950d((kt2) f04Var, lr9Var5, wt2Var4);
                                }
                                c78Var3.mo4395q();
                                return f04Var;
                            }
                        }
                    }
                } else {
                    c0855a2 = c0855a6;
                    wt2Var = wt2Var6;
                    e04Var6 = e04VarM9960a;
                    c78Var4 = c0864a;
                    c0855a2 = c0855a6;
                    wt2Var = wt2Var6;
                    e04Var6 = e04VarM9960a;
                    c78Var4 = c0864a;
                    c0855a2 = c0855a6;
                    wt2Var = wt2Var6;
                    e04Var6 = e04VarM9960a;
                    c78Var4 = c0864a;
                    if (((m18) c0855a2.f10406c.getValue()) != null) {
                        e04Var6.getClass();
                    }
                    Integer num3 = e04Var6.f36526y;
                    e04Var6.f36501A.getClass();
                    drawableM11407b = AbstractC2983f.m11407b(e04Var6, num3);
                    lr9Var2 = e04Var6.f36504c;
                    if (lr9Var2 != null) {
                        lr9Var2.mo11814u(drawableM11407b);
                    }
                    wt2Var.getClass();
                    i99 i99Var3 = e04Var6.f36523v;
                    realImageLoader$executeMain$2.f10390a = c0855a2;
                    realImageLoader$executeMain$2.f10391b = c78Var4;
                    realImageLoader$executeMain$2.f10392c = e04Var6;
                    realImageLoader$executeMain$2.f10393d = wt2Var;
                    realImageLoader$executeMain$2.f10394e = null;
                    realImageLoader$executeMain$2.f10397h = 2;
                    objMo11204h = i99Var3.mo11204h(realImageLoader$executeMain$2);
                    if (objMo11204h != coroutineSingletons) {
                        c0855a3 = c0855a2;
                        wt2Var2 = wt2Var;
                        e04Var2 = e04Var6;
                        obj = objMo11204h;
                        bitmap = null;
                        c78Var = c78Var4;
                        wt2Var2.getClass();
                        nn1 nn1Var4 = e04Var2.f36518q;
                        RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$4 = new RealImageLoader$executeMain$result$1(e04Var2, c0855a3, (w89) obj, wt2Var2, bitmap, null);
                        wt2Var5 = wt2Var2;
                        realImageLoader$executeMain$2.f10390a = c0855a3;
                        realImageLoader$executeMain$2.f10391b = c78Var;
                        realImageLoader$executeMain$2.f10392c = e04Var2;
                        realImageLoader$executeMain$2.f10393d = wt2Var5;
                        realImageLoader$executeMain$2.f10394e = null;
                        realImageLoader$executeMain$2.f10397h = 3;
                        objM23905G = wfb.m23905G(realImageLoader$executeMain$result$4, nn1Var4, realImageLoader$executeMain$2);
                        if (objM23905G != coroutineSingletons) {
                            wt2Var4 = wt2Var5;
                            e04Var4 = e04Var2;
                            obj = objM23905G;
                            c78Var3 = c78Var;
                            c0855a4 = c0855a3;
                            f04Var = (f04) obj;
                            if (f04Var instanceof hn9) {
                                hn9Var = (hn9) f04Var;
                                lr9Var = e04Var4.f36504c;
                                c0855a4.getClass();
                                e04Var5 = hn9Var.f42664b;
                                drawable = hn9Var.f42663a;
                                if (lr9Var instanceof saa) {
                                    eaaVarM25690a = e04Var5.f36508g.m25690a((saa) lr9Var, hn9Var);
                                    if (eaaVarM25690a instanceof am6) {
                                        lr9Var.mo11812p(drawable);
                                    } else {
                                        wt2Var4.getClass();
                                        eaaVarM25690a.mo557a();
                                    }
                                } else if (lr9Var != null) {
                                    lr9Var.mo11812p(drawable);
                                }
                                wt2Var4.getClass();
                                e04Var5.getClass();
                            } else {
                                if (!(f04Var instanceof kt2)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                lr9 lr9Var6 = e04Var4.f36504c;
                                c0855a4.getClass();
                                m4950d((kt2) f04Var, lr9Var6, wt2Var4);
                            }
                            c78Var3.mo4395q();
                            return f04Var;
                        }
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th6) {
                th = th6;
                r1 = c0855a6;
                r2 = wt2Var6;
                r3 = e04VarM9960a;
                r4 = c0864a;
            }
        }
        try {
            if (th instanceof CancellationException) {
                r1.getClass();
                r2.getClass();
                r3.getClass();
                throw th;
            }
            r1.f10409f.getClass();
            kt2 kt2VarM12087r3 = fs6.m12087r(r3, th);
            m4950d(kt2VarM12087r3, r3.f36504c, r2);
            r4.mo4395q();
            return kt2VarM12087r3;
        } catch (Throwable th7) {
            r4.mo4395q();
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public static void m4950d(kt2 kt2Var, lr9 lr9Var, wt2 wt2Var) {
        e04 e04Var = kt2Var.f48406b;
        Drawable drawable = kt2Var.f48405a;
        if (lr9Var instanceof saa) {
            eaa eaaVarM25690a = e04Var.f36508g.m25690a((saa) lr9Var, kt2Var);
            if (eaaVarM25690a instanceof am6) {
                lr9Var.mo11813s(drawable);
            } else {
                wt2Var.getClass();
                eaaVarM25690a.mo557a();
            }
        } else if (lr9Var != null) {
            lr9Var.mo11813s(drawable);
        }
        wt2Var.getClass();
        e04Var.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final xh2 m4951b(e04 e04Var) {
        wfb.m23910e(this.f10408e, null, new RealImageLoader$enqueue$job$1(e04Var, this, null), 3);
        lr9 lr9Var = e04Var.f36504c;
        return lr9Var instanceof t04 ? AbstractC3057h.m12988c(((t04) lr9Var).f61703b).m17058a() : new my5(10);
    }

    /* JADX INFO: renamed from: c */
    public final Object m4952c(e04 e04Var, ContinuationImpl continuationImpl) {
        if (e04Var.f36504c instanceof t04) {
            return vz1.m23649s(new RealImageLoader$execute$2(e04Var, this, null), continuationImpl);
        }
        v72 v72Var = ph2.f56212a;
        return wfb.m23905G(new RealImageLoader$execute$3(e04Var, this, null), dp5.f36000a.f68538f, continuationImpl);
    }
}
