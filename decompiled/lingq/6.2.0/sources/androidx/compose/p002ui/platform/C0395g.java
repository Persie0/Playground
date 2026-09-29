package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.p002ui.AbstractC0287b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import p000.C3386nv;
import p000.fw9;
import p000.kn1;
import p000.ui3;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.zw4;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0395g implements un1 {

    /* JADX INFO: renamed from: a */
    public final View f4766a;

    /* JADX INFO: renamed from: b */
    public final fw9 f4767b;

    /* JADX INFO: renamed from: c */
    public final un1 f4768c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f4769d = new AtomicReference(null);

    public C0395g(View view, fw9 fw9Var, un1 un1Var) {
        this.f4766a = view;
        this.f4767b = fw9Var;
        this.f4768c = un1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final CoroutineSingletons m1797a(final zw4 zw4Var, ContinuationImpl continuationImpl) throws Throwable {
        AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        if (continuationImpl instanceof AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (AndroidPlatformTextInputSession$startInputMethod$1) continuationImpl;
            int i = androidPlatformTextInputSession$startInputMethod$1.f4514c;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.f4514c = i - Integer.MIN_VALUE;
            } else {
                androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, continuationImpl);
            }
        } else {
            androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, continuationImpl);
        }
        Object obj = androidPlatformTextInputSession$startInputMethod$1.f4512a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidPlatformTextInputSession$startInputMethod$1.f4514c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            vi3 vi3Var = new vi3() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2

                /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1 */
                final class C03781 extends Lambda implements ui3 {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0395g f4517b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C03781(C0395g c0395g) {
                        super(0);
                        this.f4517b = c0395g;
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        vz1.m23637j(this.f4517b.f4768c, null);
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    return new C0405q(zw4Var, new C03781(this));
                }
            };
            AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this, null);
            androidPlatformTextInputSession$startInputMethod$1.f4514c = 1;
            if (AbstractC0287b.m1323d(this.f4769d, vi3Var, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }

    @Override // p000.un1
    /* JADX INFO: renamed from: x */
    public final kn1 mo1309x() {
        return this.f4768c.mo1309x();
    }
}
