package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.protobuf.ByteString;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0785at;
import p000.C3386nv;
import p000.InterfaceC3448p5;
import p000.c32;
import p000.d1d;
import p000.dr4;
import p000.fr4;
import p000.jr4;
import p000.lr4;
import p000.nr4;
import p000.o56;
import p000.og5;
import p000.or4;
import p000.q94;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AsyncRequestWorker$doWork$2", m4291f = "AsyncRequestWorker.kt", m4292l = {62, 68, 74, 79, 88, 93}, m4293m = "invokeSuspend", m4294v = 1)
final class AsyncRequestWorker$doWork$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5838a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5839b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AsyncRequestWorker f5840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncRequestWorker$doWork$2(AsyncRequestWorker asyncRequestWorker, Continuation continuation) {
        super(2, continuation);
        this.f5840c = asyncRequestWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AsyncRequestWorker$doWork$2 asyncRequestWorker$doWork$2 = new AsyncRequestWorker$doWork$2(this.f5840c, continuation);
        asyncRequestWorker$doWork$2.f5839b = obj;
        return asyncRequestWorker$doWork$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncRequestWorker$doWork$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r5.m2246d(r7, r1, r13, r12) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r5.m2243a(r7, r1, r13, r12) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (r6.m2244b(r7, r8, r9, r10, r12) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        if (r12 == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
    
        if (r12.m2238a(r12) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ae, code lost:
    
        if (r6.m2245c(r7, r8, r9, r10, r12) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b0, code lost:
    
        return r3;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte[] bArr;
        byte[] bArr2;
        AbstractC0661i abstractC0661i;
        AsyncRequestWorker asyncRequestWorker = this.f5840c;
        Context context = asyncRequestWorker.f56131a;
        or4 or4Var = asyncRequestWorker.f5837h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.f5838a) {
            case 0:
                AbstractC3193b.m15359b(obj);
                un1 un1Var = (un1) this.f5839b;
                if (or4Var.m18322D()) {
                    nr4 nr4VarM18327x = or4Var.m18327x();
                    Object objNewInstance = Class.forName(nr4VarM18327x.m17603r()).getDeclaredConstructor(null).newInstance(null);
                    abstractC0661i = objNewInstance instanceof AbstractC0661i ? (AbstractC0661i) objNewInstance : null;
                    if (abstractC0661i != null) {
                        int[] iArrM22621m1 = u91.m22621m1(nr4VarM18327x.m17602p());
                        this.f5838a = 1;
                    }
                } else if (or4Var.m18328y()) {
                    dr4 dr4VarM18323t = or4Var.m18323t();
                    Object objNewInstance2 = Class.forName(dr4VarM18323t.m10609r()).getDeclaredConstructor(null).newInstance(null);
                    abstractC0661i = objNewInstance2 instanceof AbstractC0661i ? (AbstractC0661i) objNewInstance2 : null;
                    if (abstractC0661i != null) {
                        int[] iArrM22621m2 = u91.m22621m1(dr4VarM18323t.m10608p());
                        this.f5838a = 2;
                    }
                } else if (or4Var.m18329z()) {
                    fr4 fr4VarM18324u = or4Var.m18324u();
                    Object objNewInstance3 = Class.forName(fr4VarM18324u.m12018t()).getDeclaredConstructor(null).newInstance(null);
                    AbstractC0661i abstractC0661i2 = objNewInstance3 instanceof AbstractC0661i ? (AbstractC0661i) objNewInstance3 : null;
                    if (abstractC0661i2 != null) {
                        Context context2 = asyncRequestWorker.f56131a;
                        int iM12017r = fr4VarM18324u.m12017r();
                        String strM12016q = fr4VarM18324u.m12016q();
                        this.f5838a = 3;
                    }
                } else if (or4Var.m18321C()) {
                    lr4 lr4VarM18326w = or4Var.m18326w();
                    String strM16477s = lr4VarM18326w.m16477s();
                    C0785at c0785at = new C0785at(lr4VarM18326w.m16476r());
                    ByteString byteStringM16475q = lr4VarM18326w.m16475q();
                    int size = byteStringM16475q.size();
                    if (size == 0) {
                        bArr2 = q94.f57450b;
                    } else {
                        byte[] bArr3 = new byte[size];
                        byteStringM16475q.mo2263h(size, bArr3);
                        bArr2 = bArr3;
                    }
                    int i = ActionCallbackBroadcastReceiver.f5981a;
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArr2, 0, bArr2.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    o56 o56VarM9994b = d1d.m9994b(bundle);
                    this.f5838a = 4;
                    Class<?> cls = Class.forName(strM16477s);
                    if (!InterfaceC3448p5.class.isAssignableFrom(cls)) {
                        C3386nv.m17633t("Provided class must implement ActionCallback.");
                        return null;
                    }
                    Object objNewInstance4 = cls.getDeclaredConstructor(null).newInstance(null);
                    objNewInstance4.getClass();
                    Object objOnAction = ((InterfaceC3448p5) objNewInstance4).onAction(context, c0785at, o56VarM9994b, this);
                    if (objOnAction != coroutineSingletons) {
                        objOnAction = xfa.f68157a;
                    }
                } else if (or4Var.m18319A()) {
                    C0660h c0660h = new C0660h(context);
                    this.f5838a = 5;
                } else if (or4Var.m18320B()) {
                    jr4 jr4VarM18325v = or4Var.m18325v();
                    Object objNewInstance5 = Class.forName(jr4VarM18325v.m14627t()).getDeclaredConstructor(null).newInstance(null);
                    AbstractC0661i abstractC0661i3 = objNewInstance5 instanceof AbstractC0661i ? (AbstractC0661i) objNewInstance5 : null;
                    if (abstractC0661i3 != null) {
                        Context context3 = asyncRequestWorker.f56131a;
                        int iM14625q = jr4VarM18325v.m14625q();
                        ByteString byteStringM14626r = jr4VarM18325v.m14626r();
                        int size2 = byteStringM14626r.size();
                        if (size2 == 0) {
                            bArr = q94.f57450b;
                        } else {
                            byte[] bArr4 = new byte[size2];
                            byteStringM14626r.mo2263h(size2, bArr4);
                            bArr = bArr4;
                        }
                        Parcel parcelObtain2 = Parcel.obtain();
                        parcelObtain2.unmarshall(bArr, 0, bArr.length);
                        parcelObtain2.setDataPosition(0);
                        Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2);
                        parcelObtain2.recycle();
                        this.f5838a = 6;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AbstractC3193b.m15359b(obj);
                break;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
        return og5.m17981a();
    }
}
