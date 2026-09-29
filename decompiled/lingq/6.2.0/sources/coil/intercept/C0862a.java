package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.C0855a;
import coil.memory.MemoryCache$Key;
import coil.size.Scale;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3057h;
import p000.C3386nv;
import p000.bd1;
import p000.bw5;
import p000.e04;
import p000.ee9;
import p000.fs6;
import p000.lp9;
import p000.ms2;
import p000.nn1;
import p000.or3;
import p000.pk0;
import p000.q23;
import p000.sl2;
import p000.sz6;
import p000.w89;
import p000.wfb;
import p000.wt2;
import p000.y84;

/* JADX INFO: renamed from: coil.intercept.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0862a implements y84 {

    /* JADX INFO: renamed from: a */
    public final C0855a f10553a;

    /* JADX INFO: renamed from: b */
    public final lp9 f10554b;

    /* JADX INFO: renamed from: c */
    public final fs6 f10555c;

    /* JADX INFO: renamed from: d */
    public final or3 f10556d;

    public C0862a(C0855a c0855a, lp9 lp9Var, fs6 fs6Var) {
        this.f10553a = c0855a;
        this.f10554b = lp9Var;
        this.f10555c = fs6Var;
        this.f10556d = new or3(c0855a, fs6Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:18:0x0093  */
    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00db  */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:24:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m4975b(coil.intercept.C0862a r17, p000.ee9 r18, p000.bd1 r19, p000.e04 r20, java.lang.Object r21, p000.sz6 r22, p000.wt2 r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.C0862a.m4975b(coil.intercept.a, ee9, bd1, e04, java.lang.Object, sz6, wt2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0191, code lost:
    
        r1 = r1;
        if (r1 == r7) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4976c(C0862a c0862a, e04 e04Var, Object obj, sz6 sz6Var, wt2 wt2Var, ContinuationImpl continuationImpl) {
        EngineInterceptor$execute$1 engineInterceptor$execute$1;
        ee9 ee9Var;
        C0862a c0862a2;
        Object obj2;
        wt2 wt2Var2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        e04 e04Var2;
        Object obj3;
        e04 e04Var3;
        Ref$ObjectRef ref$ObjectRef5;
        wt2 wt2Var3;
        C0862a c0862a3;
        Ref$ObjectRef ref$ObjectRef6;
        C0862a c0862a4;
        ms2 ms2Var;
        wt2 wt2Var4;
        e04 e04Var4;
        Object obj4;
        ee9 ee9Var2;
        sz6 sz6Var2;
        List list;
        Object obj5;
        Bitmap bitmap;
        if (continuationImpl instanceof EngineInterceptor$execute$1) {
            engineInterceptor$execute$1 = (EngineInterceptor$execute$1) continuationImpl;
            int i = engineInterceptor$execute$1.f10504k;
            if ((i & Integer.MIN_VALUE) != 0) {
                engineInterceptor$execute$1.f10504k = i - Integer.MIN_VALUE;
            } else {
                engineInterceptor$execute$1 = new EngineInterceptor$execute$1(c0862a, continuationImpl);
            }
        } else {
            engineInterceptor$execute$1 = new EngineInterceptor$execute$1(c0862a, continuationImpl);
        }
        EngineInterceptor$execute$1 engineInterceptor$execute$2 = engineInterceptor$execute$1;
        Object objM23905G = engineInterceptor$execute$2.f10502i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Ref$ObjectRef ref$ObjectRef7 = engineInterceptor$execute$2.f10504k;
        try {
            if (ref$ObjectRef7 == 0) {
                AbstractC3193b.m15359b(objM23905G);
                Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                ref$ObjectRef8.f47718a = sz6Var;
                Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                ref$ObjectRef9.f47718a = c0862a.f10553a.f10410g;
                Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                try {
                    ref$ObjectRef8.f47718a = c0862a.f10555c.m12099N((sz6) ref$ObjectRef8.f47718a);
                    e04Var.getClass();
                    bd1 bd1Var = (bd1) ref$ObjectRef9.f47718a;
                    sz6 sz6Var3 = (sz6) ref$ObjectRef8.f47718a;
                    engineInterceptor$execute$2.f10494a = c0862a;
                    engineInterceptor$execute$2.f10495b = e04Var;
                    engineInterceptor$execute$2.f10496c = obj;
                    engineInterceptor$execute$2.f10497d = wt2Var;
                    engineInterceptor$execute$2.f10498e = ref$ObjectRef8;
                    engineInterceptor$execute$2.f10499f = ref$ObjectRef9;
                    engineInterceptor$execute$2.f10500g = ref$ObjectRef10;
                    engineInterceptor$execute$2.f10501h = ref$ObjectRef10;
                    engineInterceptor$execute$2.f10504k = 1;
                    Object objM4978d = c0862a.m4978d(bd1Var, e04Var, obj, sz6Var3, wt2Var, engineInterceptor$execute$2);
                    if (objM4978d != coroutineSingletons) {
                        c0862a2 = c0862a;
                        obj2 = obj;
                        wt2Var2 = wt2Var;
                        ref$ObjectRef = ref$ObjectRef8;
                        ref$ObjectRef2 = ref$ObjectRef9;
                        ref$ObjectRef3 = ref$ObjectRef10;
                        ref$ObjectRef4 = ref$ObjectRef3;
                        e04Var2 = e04Var;
                        obj3 = objM4978d;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    th = th;
                    ref$ObjectRef7 = ref$ObjectRef10;
                    Object obj6 = ref$ObjectRef7.f47718a;
                    ee9Var = obj6 instanceof ee9 ? (ee9) obj6 : null;
                    if (ee9Var != null) {
                        AbstractC3057h.m12986a(ee9Var.f37132a);
                    }
                    throw th;
                }
            }
            if (ref$ObjectRef7 == 1) {
                ref$ObjectRef3 = engineInterceptor$execute$2.f10501h;
                ref$ObjectRef4 = engineInterceptor$execute$2.f10500g;
                Ref$ObjectRef ref$ObjectRef11 = engineInterceptor$execute$2.f10499f;
                Ref$ObjectRef ref$ObjectRef12 = engineInterceptor$execute$2.f10498e;
                wt2 wt2Var5 = (wt2) engineInterceptor$execute$2.f10497d;
                Object obj7 = engineInterceptor$execute$2.f10496c;
                e04Var2 = engineInterceptor$execute$2.f10495b;
                C0862a c0862a5 = engineInterceptor$execute$2.f10494a;
                AbstractC3193b.m15359b(objM23905G);
                ref$ObjectRef2 = ref$ObjectRef11;
                ref$ObjectRef = ref$ObjectRef12;
                wt2Var2 = wt2Var5;
                obj2 = obj7;
                c0862a2 = c0862a5;
                obj3 = objM23905G;
            } else if (ref$ObjectRef7 == 2) {
                ref$ObjectRef4 = engineInterceptor$execute$2.f10498e;
                ref$ObjectRef6 = (Ref$ObjectRef) engineInterceptor$execute$2.f10497d;
                wt2Var3 = (wt2) engineInterceptor$execute$2.f10496c;
                e04Var3 = engineInterceptor$execute$2.f10495b;
                c0862a4 = engineInterceptor$execute$2.f10494a;
                AbstractC3193b.m15359b(objM23905G);
                obj5 = objM23905G;
                ref$ObjectRef5 = ref$ObjectRef6;
                c0862a3 = c0862a4;
                ms2Var = (ms2) obj5;
                wt2Var4 = wt2Var3;
                e04Var4 = e04Var3;
                obj4 = ref$ObjectRef4.f47718a;
                if (obj4 instanceof ee9) {
                    ee9Var2 = (ee9) obj4;
                } else {
                    ee9Var2 = null;
                }
                if (ee9Var2 != null) {
                    AbstractC3057h.m12986a(ee9Var2.f37132a);
                }
                sz6Var2 = (sz6) ref$ObjectRef5.f47718a;
                engineInterceptor$execute$2.f10494a = null;
                engineInterceptor$execute$2.f10495b = null;
                engineInterceptor$execute$2.f10496c = null;
                engineInterceptor$execute$2.f10497d = null;
                engineInterceptor$execute$2.f10498e = null;
                engineInterceptor$execute$2.f10499f = null;
                engineInterceptor$execute$2.f10500g = null;
                engineInterceptor$execute$2.f10501h = null;
                engineInterceptor$execute$2.f10504k = 3;
                c0862a3.getClass();
                list = e04Var4.f36507f;
                objM23905G = ms2Var;
                if (!list.isEmpty() && ((ms2Var.f51793a instanceof BitmapDrawable) || e04Var4.f36511j)) {
                    objM23905G = ms2Var;
                    objM23905G = wfb.m23905G(new EngineInterceptor$transform$3(c0862a3, ms2Var, sz6Var2, list, wt2Var4, e04Var4, null), e04Var4.f36521t, engineInterceptor$execute$2);
                }
            } else {
                if (ref$ObjectRef7 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM23905G);
            }
            ms2 ms2Var2 = (ms2) objM23905G;
            Drawable drawable = ms2Var2.f51793a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                bitmap.prepareToDraw();
            }
            return ms2Var2;
            ref$ObjectRef3.f47718a = obj3;
            Object obj8 = ref$ObjectRef4.f47718a;
            q23 q23Var = (q23) obj8;
            if (q23Var instanceof ee9) {
                nn1 nn1Var = e04Var2.f36520s;
                Ref$ObjectRef ref$ObjectRef13 = ref$ObjectRef4;
                e04 e04Var5 = e04Var2;
                try {
                    EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(c0862a2, ref$ObjectRef13, ref$ObjectRef2, e04Var5, obj2, ref$ObjectRef, wt2Var2, null);
                    e04Var3 = e04Var5;
                    Ref$ObjectRef ref$ObjectRef14 = ref$ObjectRef;
                    wt2Var3 = wt2Var2;
                    engineInterceptor$execute$2.f10494a = c0862a2;
                    engineInterceptor$execute$2.f10495b = e04Var3;
                    engineInterceptor$execute$2.f10496c = wt2Var3;
                    engineInterceptor$execute$2.f10497d = ref$ObjectRef14;
                    engineInterceptor$execute$2.f10498e = ref$ObjectRef4;
                    engineInterceptor$execute$2.f10499f = null;
                    engineInterceptor$execute$2.f10500g = null;
                    engineInterceptor$execute$2.f10501h = null;
                    engineInterceptor$execute$2.f10504k = 2;
                    Object objM23905G2 = wfb.m23905G(engineInterceptor$execute$executeResult$1, nn1Var, engineInterceptor$execute$2);
                    if (objM23905G2 != coroutineSingletons) {
                        ref$ObjectRef6 = ref$ObjectRef14;
                        c0862a4 = c0862a2;
                        obj5 = objM23905G2;
                        ref$ObjectRef5 = ref$ObjectRef6;
                        c0862a3 = c0862a4;
                        ms2Var = (ms2) obj5;
                        wt2Var4 = wt2Var3;
                        e04Var4 = e04Var3;
                        obj4 = ref$ObjectRef4.f47718a;
                        if (obj4 instanceof ee9) {
                            ee9Var2 = (ee9) obj4;
                        } else {
                            ee9Var2 = null;
                        }
                        if (ee9Var2 != null) {
                            AbstractC3057h.m12986a(ee9Var2.f37132a);
                        }
                        sz6Var2 = (sz6) ref$ObjectRef5.f47718a;
                        engineInterceptor$execute$2.f10494a = null;
                        engineInterceptor$execute$2.f10495b = null;
                        engineInterceptor$execute$2.f10496c = null;
                        engineInterceptor$execute$2.f10497d = null;
                        engineInterceptor$execute$2.f10498e = null;
                        engineInterceptor$execute$2.f10499f = null;
                        engineInterceptor$execute$2.f10500g = null;
                        engineInterceptor$execute$2.f10501h = null;
                        engineInterceptor$execute$2.f10504k = 3;
                        c0862a3.getClass();
                        list = e04Var4.f36507f;
                        objM23905G = ms2Var;
                        if (!list.isEmpty()) {
                            objM23905G = ms2Var;
                            objM23905G = wfb.m23905G(new EngineInterceptor$transform$3(c0862a3, ms2Var, sz6Var2, list, wt2Var4, e04Var4, null), e04Var4.f36521t, engineInterceptor$execute$2);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ref$ObjectRef7 = ref$ObjectRef13;
                    Object obj9 = ref$ObjectRef7.f47718a;
                    if (obj9 instanceof ee9) {
                    }
                    if (ee9Var != null) {
                        AbstractC3057h.m12986a(ee9Var.f37132a);
                    }
                    throw th;
                }
            } else {
                e04Var3 = e04Var2;
                ref$ObjectRef5 = ref$ObjectRef;
                wt2Var3 = wt2Var2;
                if (!(q23Var instanceof sl2)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0862a3 = c0862a2;
                ms2Var = new ms2(((sl2) obj8).f60972a, ((sl2) obj8).f60973b, ((sl2) obj8).f60974c, null);
                wt2Var4 = wt2Var3;
                e04Var4 = e04Var3;
                obj4 = ref$ObjectRef4.f47718a;
                if (obj4 instanceof ee9) {
                    ee9Var2 = (ee9) obj4;
                } else {
                    ee9Var2 = null;
                }
                if (ee9Var2 != null) {
                    AbstractC3057h.m12986a(ee9Var2.f37132a);
                }
                sz6Var2 = (sz6) ref$ObjectRef5.f47718a;
                engineInterceptor$execute$2.f10494a = null;
                engineInterceptor$execute$2.f10495b = null;
                engineInterceptor$execute$2.f10496c = null;
                engineInterceptor$execute$2.f10497d = null;
                engineInterceptor$execute$2.f10498e = null;
                engineInterceptor$execute$2.f10499f = null;
                engineInterceptor$execute$2.f10500g = null;
                engineInterceptor$execute$2.f10501h = null;
                engineInterceptor$execute$2.f10504k = 3;
                c0862a3.getClass();
                list = e04Var4.f36507f;
                objM23905G = ms2Var;
                if (!list.isEmpty()) {
                    objM23905G = ms2Var;
                    objM23905G = wfb.m23905G(new EngineInterceptor$transform$3(c0862a3, ms2Var, sz6Var2, list, wt2Var4, e04Var4, null), e04Var4.f36521t, engineInterceptor$execute$2);
                }
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // p000.y84
    /* JADX INFO: renamed from: a */
    public final Object mo4977a(C0863b c0863b, Continuation continuation) throws Throwable {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        C0862a c0862a = this;
        C0863b c0863b2 = c0863b;
        or3 or3Var = c0862a.f10556d;
        if (continuation instanceof EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuation;
            int i = engineInterceptor$intercept$1.f10527e;
            if ((i & Integer.MIN_VALUE) != 0) {
                engineInterceptor$intercept$1.f10527e = i - Integer.MIN_VALUE;
            } else {
                engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(c0862a, (ContinuationImpl) continuation);
            }
        } else {
            engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(c0862a, (ContinuationImpl) continuation);
        }
        EngineInterceptor$intercept$1 engineInterceptor$intercept$2 = engineInterceptor$intercept$1;
        Object obj = engineInterceptor$intercept$2.f10525c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = engineInterceptor$intercept$2.f10527e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            try {
                e04 e04Var = c0863b2.f10560d;
                Object obj2 = e04Var.f36503b;
                w89 w89Var = c0863b2.f10561e;
                Bitmap.Config[] configArr = AbstractC3057h.f41581a;
                wt2 wt2Var = c0863b2.f10562f;
                sz6 sz6VarM12090E = c0862a.f10555c.m12090E(e04Var, w89Var);
                Scale scale = sz6VarM12090E.f61663e;
                List list = c0862a.f10553a.f10410g.f8360b;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    try {
                        Pair pair = (Pair) list.get(i3);
                        pk0 pk0Var = (pk0) pair.f47623a;
                        if (((Class) pair.f47624b).isAssignableFrom(obj2.getClass())) {
                            pk0Var.getClass();
                            Object objM19359a = pk0Var.m19359a(obj2, sz6VarM12090E);
                            if (objM19359a != null) {
                                obj2 = objM19359a;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        c0862a = this;
                    }
                }
                MemoryCache$Key memoryCache$KeyM18296H = or3Var.m18296H(e04Var, obj2, sz6VarM12090E, wt2Var);
                bw5 bw5VarM18292C = memoryCache$KeyM18296H != null ? or3Var.m18292C(e04Var, memoryCache$KeyM18296H, w89Var, scale) : null;
                if (bw5VarM18292C != null) {
                    return or3.m18288J(c0863b2, e04Var, memoryCache$KeyM18296H, bw5VarM18292C);
                }
                nn1 nn1Var = e04Var.f36519r;
                c0862a = this;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$3 = new EngineInterceptor$intercept$2(c0862a, e04Var, obj2, sz6VarM12090E, wt2Var, memoryCache$KeyM18296H, c0863b2, null);
                engineInterceptor$intercept$2.f10523a = c0862a;
                engineInterceptor$intercept$2.f10524b = c0863b2;
                engineInterceptor$intercept$2.f10527e = 1;
                Object objM23905G = wfb.m23905G(engineInterceptor$intercept$3, nn1Var, engineInterceptor$intercept$2);
                return objM23905G == coroutineSingletons ? coroutineSingletons : objM23905G;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C0863b c0863b3 = engineInterceptor$intercept$2.f10524b;
            C0862a c0862a2 = engineInterceptor$intercept$2.f10523a;
            try {
                AbstractC3193b.m15359b(obj);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                c0863b2 = c0863b3;
                c0862a = c0862a2;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        fs6 fs6Var = c0862a.f10555c;
        return fs6.m12087r(c0863b2.f10560d, th);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c1 -> B:29:0x00c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m4978d(p000.bd1 r18, p000.e04 r19, java.lang.Object r20, p000.sz6 r21, p000.wt2 r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.C0862a.m4978d(bd1, e04, java.lang.Object, sz6, wt2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
