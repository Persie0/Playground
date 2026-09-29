package androidx.compose.p017ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import dm.C5207g;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.C7828f;
import no.C7832g0;
import p260m8.C7499b;
import p328q1.AbstractC8464a;
import p328q1.C8475l;
import p328q1.C8481r;
import p328q1.C8482s;
import p328q1.InterfaceC8468e;
import p328q1.InterfaceC8479p;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidFontLoader implements InterfaceC8479p {

    /* JADX INFO: renamed from: a */
    public final Context f4575a;

    public AndroidFontLoader(Context context) {
        this.f4575a = context.getApplicationContext();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p328q1.InterfaceC8479p
    /* JADX INFO: renamed from: a */
    public final Typeface mo2588a(InterfaceC8468e interfaceC8468e) {
        Object objM14967u;
        Typeface typefaceM16553a;
        boolean z10 = interfaceC8468e instanceof AbstractC8464a;
        Object obj = null;
        Context context = this.f4575a;
        if (z10) {
            C5207g.m11110e(context, "context");
            throw null;
        }
        if (!(interfaceC8468e instanceof C8481r)) {
            return null;
        }
        int iMo16543a = interfaceC8468e.mo16543a();
        boolean z11 = false;
        boolean z12 = iMo16543a == 0;
        C8482s c8482s = C8482s.f45663a;
        if (z12) {
            C5207g.m11110e(context, "context");
            typefaceM16553a = c8482s.m16553a(context, (C8481r) interfaceC8468e);
        } else {
            if (!(iMo16543a == 1)) {
                if (iMo16543a == 2) {
                    z11 = true;
                }
                if (z11) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) C7499b.m14903F0(interfaceC8468e.mo16543a())));
            }
            try {
                C5207g.m11110e(context, "context");
                objM14967u = c8482s.m16553a(context, (C8481r) interfaceC8468e);
            } catch (Throwable th2) {
                objM14967u = C7499b.m14967u(th2);
            }
            if (!(objM14967u instanceof Result.Failure)) {
                obj = objM14967u;
            }
            typefaceM16553a = (Typeface) obj;
        }
        C5207g.m11110e(context, "context");
        return C0702h.m2600a(typefaceM16553a, ((C8481r) interfaceC8468e).f45661d, context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p328q1.InterfaceC8479p
    /* JADX INFO: renamed from: b */
    public final Object mo2589b(InterfaceC8468e interfaceC8468e, InterfaceC9968c<? super Typeface> interfaceC9968c) throws Throwable {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        AndroidFontLoader androidFontLoader;
        if (interfaceC9968c instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) interfaceC9968c;
            int i10 = androidFontLoader$awaitLoad$1.f4580h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.f4580h = i10 - Integer.MIN_VALUE;
            } else {
                androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, interfaceC9968c);
            }
        } else {
            androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, interfaceC9968c);
        }
        Object objM15574h = androidFontLoader$awaitLoad$1.f4578f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = androidFontLoader$awaitLoad$1.f4580h;
        if (i11 == 0) {
            C7499b.m14977z0(objM15574h);
            boolean z10 = interfaceC8468e instanceof AbstractC8464a;
            Context context = this.f4575a;
            if (z10) {
                ((AbstractC8464a) interfaceC8468e).getClass();
                C5207g.m11110e(context, "context");
                androidFontLoader$awaitLoad$1.f4580h = 1;
                throw null;
            }
            if (!(interfaceC8468e instanceof C8481r)) {
                throw new IllegalArgumentException("Unknown font type: " + interfaceC8468e);
            }
            C5207g.m11110e(context, "context");
            androidFontLoader$awaitLoad$1.f4576d = this;
            androidFontLoader$awaitLoad$1.f4577e = interfaceC8468e;
            androidFontLoader$awaitLoad$1.f4580h = 2;
            objM15574h = C7828f.m15574h(androidFontLoader$awaitLoad$1, C7832g0.f42931b, new AndroidFontLoader_androidKt$loadAsync$2((C8481r) interfaceC8468e, context, null));
            if (objM15574h == coroutineSingletons) {
                return coroutineSingletons;
            }
            androidFontLoader = this;
        } else {
            if (i11 == 1) {
                C7499b.m14977z0(objM15574h);
                return objM15574h;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC8468e = androidFontLoader$awaitLoad$1.f4577e;
            androidFontLoader = androidFontLoader$awaitLoad$1.f4576d;
            C7499b.m14977z0(objM15574h);
        }
        C8475l c8475l = ((C8481r) interfaceC8468e).f45661d;
        Context context2 = androidFontLoader.f4575a;
        C5207g.m11110e(context2, "context");
        return C0702h.m2600a((Typeface) objM15574h, c8475l, context2);
    }

    @Override // p328q1.InterfaceC8479p
    /* JADX INFO: renamed from: c */
    public final void mo2590c() {
    }
}
