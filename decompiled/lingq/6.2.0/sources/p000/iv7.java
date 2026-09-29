package p000;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.feature.reader.reader.C2479xe6386fb0;
import com.lingq.feature.reader.reader.C2481xe6549eb2;
import com.lingq.feature.reader.reader.C2488x80c205d1;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$3$2$1;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class iv7 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f44678b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2493a f44679c;

    public /* synthetic */ iv7(e83 e83Var, C2493a c2493a, int i) {
        this.f44677a = i;
        this.f44678b = e83Var;
        this.f44679c = c2493a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        C2479xe6386fb0 c2479xe6386fb0;
        C2481xe6549eb2 c2481xe6549eb2;
        C2488x80c205d1 c2488x80c205d1;
        ReaderComposeViewModel$special$$inlined$map$3$2$1 readerComposeViewModel$special$$inlined$map$3$2$1;
        xz7 xz7Var;
        int i = this.f44677a;
        xfa xfaVar = xfa.f68157a;
        e83 e83Var = this.f44678b;
        boolean z = false;
        i = 0;
        int i2 = 0;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        C2493a c2493a = this.f44679c;
        switch (i) {
            case 0:
                if (continuation instanceof C2479xe6386fb0) {
                    c2479xe6386fb0 = (C2479xe6386fb0) continuation;
                    int i3 = c2479xe6386fb0.f30000b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c2479xe6386fb0.f30000b = i3 - Integer.MIN_VALUE;
                    } else {
                        c2479xe6386fb0 = new C2479xe6386fb0(this, continuation);
                    }
                } else {
                    c2479xe6386fb0 = new C2479xe6386fb0(this, continuation);
                }
                Object obj2 = c2479xe6386fb0.f29999a;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = c2479xe6386fb0.f30000b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                yz4 yz4Var = (yz4) obj;
                if (c2493a.f30194P) {
                    Lesson lesson = yz4Var.f70667a;
                    if ((lesson != null ? lesson.f19162u : null) != null) {
                        z = true;
                    }
                }
                Object objValueOf = Boolean.valueOf(z);
                c2479xe6386fb0.f30000b = 1;
                return e83Var.emit(objValueOf, c2479xe6386fb0) == obj3 ? obj3 : xfaVar;
            case 1:
                if (continuation instanceof C2481xe6549eb2) {
                    c2481xe6549eb2 = (C2481xe6549eb2) continuation;
                    int i5 = c2481xe6549eb2.f30006b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c2481xe6549eb2.f30006b = i5 - Integer.MIN_VALUE;
                    } else {
                        c2481xe6549eb2 = new C2481xe6549eb2(this, continuation);
                    }
                } else {
                    c2481xe6549eb2 = new C2481xe6549eb2(this, continuation);
                }
                Object obj4 = c2481xe6549eb2.f30005a;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = c2481xe6549eb2.f30006b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                yz4 yz4Var2 = (yz4) obj;
                if (c2493a.f30194P) {
                    Lesson lesson2 = yz4Var2.f70667a;
                    if ((lesson2 != null ? lesson2.f19162u : null) != null) {
                        z3 = true;
                    }
                }
                Object objValueOf2 = Boolean.valueOf(z3);
                c2481xe6549eb2.f30006b = 1;
                return e83Var.emit(objValueOf2, c2481xe6549eb2) == obj5 ? obj5 : xfaVar;
            case 2:
                if (continuation instanceof C2488x80c205d1) {
                    c2488x80c205d1 = (C2488x80c205d1) continuation;
                    int i7 = c2488x80c205d1.f30045b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c2488x80c205d1.f30045b = i7 - Integer.MIN_VALUE;
                    } else {
                        c2488x80c205d1 = new C2488x80c205d1(this, continuation);
                    }
                } else {
                    c2488x80c205d1 = new C2488x80c205d1(this, continuation);
                }
                Object obj6 = c2488x80c205d1.f30044a;
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = c2488x80c205d1.f30045b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                yz4 yz4Var3 = (yz4) obj;
                if (c2493a.f30194P) {
                    Lesson lesson3 = yz4Var3.f70667a;
                    if ((lesson3 != null ? lesson3.f19162u : null) != null) {
                        z2 = true;
                    }
                }
                Object objValueOf3 = Boolean.valueOf(z2);
                c2488x80c205d1.f30045b = 1;
                return e83Var.emit(objValueOf3, c2488x80c205d1) == obj7 ? obj7 : xfaVar;
            default:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$3$2$1) {
                    readerComposeViewModel$special$$inlined$map$3$2$1 = (ReaderComposeViewModel$special$$inlined$map$3$2$1) continuation;
                    int i9 = readerComposeViewModel$special$$inlined$map$3$2$1.f30102b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$3$2$1.f30102b = i9 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$3$2$1 = new ReaderComposeViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$3$2$1 = new ReaderComposeViewModel$special$$inlined$map$3$2$1(this, continuation);
                }
                Object obj8 = readerComposeViewModel$special$$inlined$map$3$2$1.f30101a;
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = readerComposeViewModel$special$$inlined$map$3$2$1.f30102b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC3193b.m15359b(obj8);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj8);
                yz4 yz4Var4 = (yz4) obj;
                if (c2493a.f30194P) {
                    i2 = yz4Var4.f70680n + 1;
                } else {
                    ox7 ox7Var = (ox7) u91.m22592J0(yz4Var4.f70680n, yz4Var4.f70670d);
                    if (ox7Var != null && (xz7Var = (xz7) u91.m22591I0(ox7Var.f55132e)) != null) {
                        i2 = xz7Var.f69010g;
                    }
                }
                j13 j13Var = c2493a.f30235y;
                Lesson lesson4 = yz4Var4.f70667a;
                Integer num = new Integer(i2);
                j13Var.getClass();
                Object objM14252j = j13.m14252j(lesson4, num);
                readerComposeViewModel$special$$inlined$map$3$2$1.f30102b = 1;
                return e83Var.emit(objM14252j, readerComposeViewModel$special$$inlined$map$3$2$1) == obj9 ? obj9 : xfaVar;
        }
    }
}
