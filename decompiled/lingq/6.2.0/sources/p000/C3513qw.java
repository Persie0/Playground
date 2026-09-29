package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: qw */
/* JADX INFO: loaded from: classes2.dex */
public final class C3513qw implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f58261b;

    public /* synthetic */ C3513qw(c83 c83Var, int i) {
        this.f58260a = i;
        this.f58261b = c83Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f58260a;
        int i2 = 25;
        int i3 = 26;
        int i4 = 27;
        int i5 = 3;
        int i6 = 4;
        int i7 = 5;
        int i8 = 8;
        xfa xfaVar = xfa.f68157a;
        c83 c83Var = this.f58261b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new C3475pw(e83Var, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new C3475pw(e83Var, i5), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new C3475pw(e83Var, i6), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new C3475pw(e83Var, i7), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c83Var.collect(new C3475pw(e83Var, 6), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c83Var.collect(new C3475pw(e83Var, i8), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c83Var.collect(new C3475pw(e83Var, 16), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c83Var.collect(new C3475pw(e83Var, 18), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = c83Var.collect(new C3475pw(e83Var, 23), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = c83Var.collect(new C3475pw(e83Var, 24), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            case 10:
                Object objCollect11 = c83Var.collect(new C3475pw(e83Var, i2), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
            case 11:
                Object objCollect12 = c83Var.collect(new C3475pw(e83Var, i3), continuation);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : xfaVar;
            case 12:
                Object objCollect13 = c83Var.collect(new C3475pw(e83Var, i4), continuation);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : xfaVar;
            case 13:
                Object objCollect14 = c83Var.collect(new bn3(e83Var, i2), continuation);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : xfaVar;
            case 14:
                Object objCollect15 = c83Var.collect(new bn3(e83Var, i3), continuation);
                return objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect15 : xfaVar;
            case 15:
                Object objCollect16 = c83Var.collect(new bn3(e83Var, i4), continuation);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : xfaVar;
            case 16:
                Object objCollect17 = c83Var.collect(new bn3(e83Var, 29), continuation);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : xfaVar;
            case 17:
                Object objCollect18 = c83Var.collect(new zd7(e83Var, 1), continuation);
                return objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect18 : xfaVar;
            case 18:
                Object objCollect19 = c83Var.collect(new zd7(e83Var, 2), continuation);
                return objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect19 : xfaVar;
            case 19:
                Object objCollect20 = c83Var.collect(new zd7(e83Var, i5), continuation);
                return objCollect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect20 : xfaVar;
            case 20:
                Object objCollect21 = c83Var.collect(new zd7(e83Var, i6), continuation);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : xfaVar;
            case 21:
                Object objCollect22 = c83Var.collect(new zd7(e83Var, i7), continuation);
                return objCollect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect22 : xfaVar;
            case 22:
                Object objCollect23 = c83Var.collect(new zd7(e83Var, 7), continuation);
                return objCollect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect23 : xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                Object objCollect24 = c83Var.collect(new zd7(e83Var, i8), continuation);
                return objCollect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect24 : xfaVar;
            case 24:
                Object objCollect25 = c83Var.collect(new zd7(e83Var, 9), continuation);
                return objCollect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect25 : xfaVar;
            case 25:
                Object objCollect26 = c83Var.collect(new zd7(e83Var, 10), continuation);
                return objCollect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect26 : xfaVar;
            case 26:
                Object objCollect27 = c83Var.collect(new zd7(e83Var, 12), continuation);
                return objCollect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect27 : xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Object objCollect28 = c83Var.collect(new zd7(e83Var, 13), continuation);
                return objCollect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect28 : xfaVar;
            case 28:
                Object objCollect29 = c83Var.collect(new zd7(e83Var, 14), continuation);
                return objCollect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect29 : xfaVar;
            default:
                Object objCollect30 = c83Var.collect(new zd7(e83Var, 15), continuation);
                return objCollect30 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect30 : xfaVar;
        }
    }
}
