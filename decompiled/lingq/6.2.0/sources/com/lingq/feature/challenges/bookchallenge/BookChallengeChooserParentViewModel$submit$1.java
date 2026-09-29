package com.lingq.feature.challenges.bookchallenge;

import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.challenges.domain.C1983b;
import com.lingq.feature.challenges.domain.C1984c;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.af0;
import p000.c32;
import p000.cma;
import p000.df0;
import p000.fa4;
import p000.gha;
import p000.i14;
import p000.j14;
import p000.l14;
import p000.pya;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentViewModel$submit$1", m4291f = "BookChallengeChooserParentViewModel.kt", m4292l = {125, 137}, m4293m = "invokeSuspend", m4294v = 2)
final class BookChallengeChooserParentViewModel$submit$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1972c f24536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pya f24537c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f24538d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte[] f24539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookChallengeChooserParentViewModel$submit$1(C1972c c1972c, pya pyaVar, String str, byte[] bArr, Continuation continuation) {
        super(1, continuation);
        this.f24536b = c1972c;
        this.f24537c = pyaVar;
        this.f24538d = str;
        this.f24539e = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BookChallengeChooserParentViewModel$submit$1(this.f24536b, this.f24537c, this.f24538d, this.f24539e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((BookChallengeChooserParentViewModel$submit$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (r0 == r12) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        df0 df0Var;
        String message;
        Object value2;
        df0 df0Var2;
        Object value3;
        df0 df0Var3;
        String str;
        Object value4;
        Object objM8847a;
        BookChallengeChooserParentViewModel$submit$1 bookChallengeChooserParentViewModel$submit$1 = this;
        C1972c c1972c = bookChallengeChooserParentViewModel$submit$1.f24536b;
        cma cmaVar = c1972c.f24542b;
        af0 af0Var = c1972c.f24548h;
        C3244l c3244l = c1972c.f24549i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = bookChallengeChooserParentViewModel$submit$1.f24535a;
        Object failure = null;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                while (true) {
                    Object value5 = c3244l.getValue();
                    if (c3244l.m15570h(value5, df0.m10318a((df0) value5, null, null, null, null, null, true, null, 0, 927))) {
                        break;
                    }
                    bookChallengeChooserParentViewModel$submit$1 = this;
                }
                pya pyaVar = bookChallengeChooserParentViewModel$submit$1.f24537c;
                if (pyaVar != null) {
                    C1984c c1984c = c1972c.f24545e;
                    String strMo4589b2 = cmaVar.mo4589b2();
                    int i2 = pyaVar.f57001a;
                    Integer num = new Integer(af0Var.f569c);
                    if (num.intValue() < 0) {
                        num = null;
                    }
                    gha ghaVar = new gha(i2, num, af0Var.f567a, af0Var.f568b);
                    bookChallengeChooserParentViewModel$submit$1.f24535a = 1;
                    if (c1984c.m8848a(strMo4589b2, "book_journey", ghaVar, bookChallengeChooserParentViewModel$submit$1) == coroutineSingletons) {
                    }
                } else {
                    C1983b c1983b = c1972c.f24546f;
                    String strMo4589b3 = cmaVar.mo4589b2();
                    String str2 = bookChallengeChooserParentViewModel$submit$1.f24538d;
                    if (str2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    byte[] bArr = bookChallengeChooserParentViewModel$submit$1.f24539e;
                    if (bArr == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    boolean zMo4598w2 = cmaVar.mo4598w2();
                    Integer num2 = new Integer(af0Var.f569c);
                    Integer num3 = num2.intValue() >= 0 ? num2 : null;
                    boolean z = af0Var.f567a;
                    boolean z2 = af0Var.f568b;
                    bookChallengeChooserParentViewModel$submit$1.f24535a = 2;
                    objM8847a = c1983b.m8847a(strMo4589b3, "book_journey", str2, bArr, zMo4598w2, num3, z, z2, bookChallengeChooserParentViewModel$submit$1);
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM8847a = obj;
                failure = (l14) objM8847a;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            l14 l14Var = (l14) failure;
            if (fa4.m11650l(l14Var, j14.f44895a)) {
                do {
                    value4 = c3244l.getValue();
                } while (!c3244l.m15570h(value4, df0.m10318a((df0) value4, null, null, null, null, null, false, null, 0, 991)));
                c1972c.mo3737M1(UpgradeReason.LIMIT_IMPORTS);
            } else if (l14Var instanceof i14) {
                do {
                    value3 = c3244l.getValue();
                    df0Var3 = (df0) value3;
                    str = ((i14) l14Var).f43328a;
                } while (!c3244l.m15570h(value3, df0.m10318a(df0Var3, null, null, null, null, null, false, str == null ? "Couldn't update the Book Challenge. Please try again." : str, 0, 927)));
            } else {
                do {
                    value2 = c3244l.getValue();
                    df0Var2 = (df0) value2;
                } while (!c3244l.m15570h(value2, df0.m10318a(df0Var2, null, null, null, null, null, false, null, df0Var2.f35543h + 1, 863)));
            }
        }
        Throwable thM15355a = Result.m15355a(failure);
        if (thM15355a != null) {
            if (thM15355a instanceof CancellationException) {
                throw thM15355a;
            }
            do {
                value = c3244l.getValue();
                df0Var = (df0) value;
                message = thM15355a.getMessage();
            } while (!c3244l.m15570h(value, df0.m10318a(df0Var, null, null, null, null, null, false, message == null ? "Couldn't update the Book Challenge. Please try again." : message, 0, 927)));
        }
        return xfa.f68157a;
    }
}
