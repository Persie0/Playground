package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class mv7 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f51889b;

    public /* synthetic */ mv7(c83 c83Var, int i) {
        this.f51888a = i;
        this.f51889b = c83Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f51888a;
        int i2 = 17;
        int i3 = 18;
        int i4 = 19;
        int i5 = 20;
        int i6 = 21;
        int i7 = 23;
        int i8 = 2;
        int i9 = 3;
        xfa xfaVar = xfa.f68157a;
        c83 c83Var = this.f51889b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new zd7(e83Var, 16), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new zd7(e83Var, i2), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new zd7(e83Var, i3), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new zd7(e83Var, i4), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c83Var.collect(new zd7(e83Var, i5), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c83Var.collect(new zd7(e83Var, i6), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c83Var.collect(new zd7(e83Var, i7), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c83Var.collect(new wv7(e83Var, i8), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = c83Var.collect(new wv7(e83Var, i9), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = c83Var.collect(new wv7(e83Var, 4), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            case 10:
                Object objCollect11 = c83Var.collect(new wv7(e83Var, 5), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
            case 11:
                Object objCollect12 = c83Var.collect(new wv7(e83Var, 6), continuation);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : xfaVar;
            case 12:
                Object objCollect13 = c83Var.collect(new wv7(e83Var, 8), continuation);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : xfaVar;
            case 13:
                Object objCollect14 = c83Var.collect(new wv7(e83Var, 9), continuation);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : xfaVar;
            case 14:
                Object objCollect15 = c83Var.collect(new wv7(e83Var, i2), continuation);
                return objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect15 : xfaVar;
            case 15:
                Object objCollect16 = c83Var.collect(new wv7(e83Var, i3), continuation);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : xfaVar;
            case 16:
                Object objCollect17 = c83Var.collect(new wv7(e83Var, i4), continuation);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : xfaVar;
            case 17:
                Object objCollect18 = c83Var.collect(new wv7(e83Var, i5), continuation);
                return objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect18 : xfaVar;
            case 18:
                Object objCollect19 = c83Var.collect(new wv7(e83Var, i6), continuation);
                return objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect19 : xfaVar;
            case 19:
                Object objCollect20 = c83Var.collect(new wv7(e83Var, 22), continuation);
                return objCollect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect20 : xfaVar;
            case 20:
                Object objCollect21 = c83Var.collect(new wv7(e83Var, i7), continuation);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : xfaVar;
            case 21:
                Object objCollect22 = c83Var.collect(new wv7(e83Var, 24), continuation);
                return objCollect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect22 : xfaVar;
            case 22:
                Object objCollect23 = c83Var.collect(new wv7(e83Var, 25), continuation);
                return objCollect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect23 : xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                Object objCollect24 = c83Var.collect(new wv7(e83Var, 27), continuation);
                return objCollect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect24 : xfaVar;
            case 24:
                Object objCollect25 = c83Var.collect(new wv7(e83Var, 26), continuation);
                return objCollect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect25 : xfaVar;
            case 25:
                Object objCollect26 = c83Var.collect(new wv7(e83Var, 28), continuation);
                return objCollect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect26 : xfaVar;
            case 26:
                Object objCollect27 = c83Var.collect(new wv7(e83Var, 29), continuation);
                return objCollect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect27 : xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Object objCollect28 = c83Var.collect(new o08(e83Var, 1), continuation);
                return objCollect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect28 : xfaVar;
            case 28:
                Object objCollect29 = c83Var.collect(new o08(e83Var, i8), continuation);
                return objCollect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect29 : xfaVar;
            default:
                Object objCollect30 = c83Var.collect(new o08(e83Var, i9), continuation);
                return objCollect30 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect30 : xfaVar;
        }
    }
}
