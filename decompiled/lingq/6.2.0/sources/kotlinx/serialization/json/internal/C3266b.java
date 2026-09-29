package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.AbstractC3264d;
import kotlinx.serialization.json.C3261a;
import kotlinx.serialization.json.C3263c;
import kotlinx.serialization.json.JsonNull;
import p000.C3488q8;
import p000.aj3;
import p000.d32;
import p000.fa4;
import p000.kf4;
import p000.lda;
import p000.v32;
import p000.w32;
import p000.xfa;
import p000.zf4;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3266b {

    /* JADX INFO: renamed from: a */
    public final C3488q8 f48256a;

    /* JADX INFO: renamed from: b */
    public final boolean f48257b;

    /* JADX INFO: renamed from: c */
    public int f48258c;

    public C3266b(kf4 kf4Var, C3488q8 c3488q8) {
        this.f48256a = c3488q8;
        this.f48257b = kf4Var.f47127c;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008b -> B:27:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m15623a(kotlinx.serialization.json.internal.C3266b r13, p000.w32 r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C3266b.m15623a(kotlinx.serialization.json.internal.b, w32, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3262b m15624b() throws Throwable {
        AbstractC3262b c3263c;
        Object obj;
        C3488q8 c3488q8 = this.f48256a;
        byte bM19718D = c3488q8.m19718D();
        if (bM19718D == 1) {
            return m15626d(true);
        }
        if (bM19718D == 0) {
            return m15626d(false);
        }
        if (bM19718D != 6) {
            if (bM19718D == 8) {
                return m15625c();
            }
            C3488q8.m19714s(c3488q8, "Cannot read Json element because of unexpected ".concat(d32.m10046j0(bM19718D)), 0, null, 6);
            throw null;
        }
        int i = this.f48258c + 1;
        this.f48258c = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            CoroutineSingletons coroutineSingletons = v32.f64781a;
            w32 w32Var = new w32();
            w32Var.f66325a = jsonTreeReader$readDeepRecursive$1;
            w32Var.f66326b = w32Var;
            CoroutineSingletons coroutineSingletons2 = v32.f64781a;
            w32Var.f66327c = coroutineSingletons2;
            while (true) {
                obj = w32Var.f66327c;
                Continuation continuation = w32Var.f66326b;
                if (continuation == null) {
                    break;
                }
                if (fa4.m11650l(coroutineSingletons2, obj)) {
                    try {
                        aj3 aj3Var = w32Var.f66325a;
                        lda.m16119e(3, aj3Var);
                        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$2 = new JsonTreeReader$readDeepRecursive$1(((JsonTreeReader$readDeepRecursive$1) aj3Var).f48245d, continuation);
                        jsonTreeReader$readDeepRecursive$2.f48244c = w32Var;
                        Object objInvokeSuspend = jsonTreeReader$readDeepRecursive$2.invokeSuspend(xfa.f68157a);
                        if (objInvokeSuspend != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            continuation.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        continuation.resumeWith(new Result.Failure(th));
                    }
                } else {
                    w32Var.f66327c = coroutineSingletons2;
                    continuation.resumeWith(obj);
                }
            }
            AbstractC3193b.m15359b(obj);
            c3263c = (AbstractC3262b) obj;
        } else {
            byte bM19740h = c3488q8.m19740h((byte) 6);
            if (c3488q8.m19718D() == 4) {
                C3488q8.m19714s(c3488q8, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c3488q8.m19735c()) {
                String strM19745m = this.f48257b ? c3488q8.m19745m() : c3488q8.m19744l();
                c3488q8.m19740h((byte) 5);
                linkedHashMap.put(strM19745m, m15624b());
                bM19740h = c3488q8.m19739g();
                if (bM19740h != 4) {
                    if (bM19740h == 7) {
                        break;
                    }
                    C3488q8.m19714s(c3488q8, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bM19740h == 6) {
                c3488q8.m19740h((byte) 7);
            } else if (bM19740h == 4) {
                fa4.m11662x(c3488q8, "object");
                throw null;
            }
            c3263c = new C3263c(linkedHashMap);
        }
        this.f48258c--;
        return c3263c;
    }

    /* JADX INFO: renamed from: c */
    public final C3261a m15625c() {
        C3488q8 c3488q8 = this.f48256a;
        byte bM19739g = c3488q8.m19739g();
        if (c3488q8.m19718D() == 4) {
            C3488q8.m19714s(c3488q8, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c3488q8.m19735c()) {
            arrayList.add(m15624b());
            bM19739g = c3488q8.m19739g();
            if (bM19739g != 4) {
                boolean z = bM19739g == 9;
                int i = c3488q8.f57368b;
                if (!z) {
                    C3488q8.m19714s(c3488q8, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bM19739g == 8) {
            c3488q8.m19740h((byte) 9);
        } else if (bM19739g == 4) {
            fa4.m11662x(c3488q8, "array");
            throw null;
        }
        return new C3261a(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC3264d m15626d(boolean z) {
        boolean z2 = this.f48257b;
        C3488q8 c3488q8 = this.f48256a;
        String strM19745m = (z2 || !z) ? c3488q8.m19745m() : c3488q8.m19744l();
        return (z || !fa4.m11650l(strM19745m, "null")) ? new zf4(strM19745m, z) : JsonNull.INSTANCE;
    }
}
