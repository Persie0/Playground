package androidx.compose.foundation.gestures;

import ae.C0062b;
import androidx.compose.foundation.MutatePriority;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p105f0.C5458f;
import p260m8.C7499b;
import p375s0.C8941c;
import p375s0.C8942d;
import p401u.InterfaceC9356i;
import p401u.InterfaceC9357j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", m19206f = "ContentInViewModifier.kt", m19207l = {193}, m19208m = "invokeSuspend")
public final class ContentInViewModifier$launchAnimation$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1968e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f1969f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ContentInViewModifier f1970g;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lu/i;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", m19206f = "ContentInViewModifier.kt", m19207l = {198}, m19208m = "invokeSuspend")
    public static final class C03961 extends SuspendLambda implements InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f1971e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f1972f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ContentInViewModifier f1973g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC7875v0 f1974h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03961(ContentInViewModifier contentInViewModifier, InterfaceC7875v0 interfaceC7875v0, InterfaceC9968c<? super C03961> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f1973g = contentInViewModifier;
            this.f1974h = interfaceC7875v0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C03961 c03961 = new C03961(this.f1973g, this.f1974h, interfaceC9968c);
            c03961.f1972f = obj;
            return c03961;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC9356i interfaceC9356i, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C03961) mo1336a(interfaceC9356i, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1971e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                final InterfaceC9356i interfaceC9356i = (InterfaceC9356i) this.f1972f;
                final ContentInViewModifier contentInViewModifier = this.f1973g;
                contentInViewModifier.f1964l.f2272d = ContentInViewModifier.m1433h(contentInViewModifier);
                UpdatableAnimationState updatableAnimationState = contentInViewModifier.f1964l;
                final InterfaceC7875v0 interfaceC7875v0 = this.f1974h;
                InterfaceC2052l<Float, C9072e> interfaceC2052l = new InterfaceC2052l<Float, C9072e>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Float f3) {
                        float fFloatValue = f3.floatValue();
                        float f10 = contentInViewModifier.f1956d ? 1.0f : -1.0f;
                        float fMo1442a = interfaceC9356i.mo1442a(f10 * fFloatValue) * f10;
                        if (fMo1442a < fFloatValue) {
                            CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fMo1442a + " < " + fFloatValue + ')');
                            cancellationException.initCause(null);
                            interfaceC7875v0.mo15618a(cancellationException);
                        }
                        return C9072e.f47360a;
                    }
                };
                InterfaceC2041a<C9072e> interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.2
                    {
                        super(0);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        ContentInViewModifier contentInViewModifier2 = contentInViewModifier;
                        C0412a c0412a = contentInViewModifier2.f1957e;
                        while (true) {
                            if (!c0412a.f2285a.m11695l()) {
                                break;
                            }
                            C5458f<ContentInViewModifier.C0394a> c5458f = c0412a.f2285a;
                            if (!c5458f.m11694k()) {
                                C8942d c8942dMo807E = c5458f.f34017a[c5458f.f34019c - 1].f1965a.mo807E();
                                if (!(c8942dMo807E == null ? true : C8941c.m17162a(contentInViewModifier2.m1440m(c8942dMo807E, contentInViewModifier2.f1962j), C8941c.f46888b))) {
                                    break;
                                }
                                c5458f.m11697n(c5458f.f34019c - 1).f1966b.mo2031y(C9072e.f47360a);
                            } else {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                        }
                        if (contentInViewModifier2.f1961i) {
                            C8942d c8942dM1437i = contentInViewModifier2.m1437i();
                            if (c8942dM1437i != null && C8941c.m17162a(contentInViewModifier2.m1440m(c8942dM1437i, contentInViewModifier2.f1962j), C8941c.f46888b)) {
                                contentInViewModifier2.f1961i = false;
                            }
                        }
                        contentInViewModifier2.f1964l.f2272d = ContentInViewModifier.m1433h(contentInViewModifier2);
                        return C9072e.f47360a;
                    }
                };
                this.f1971e = 1;
                if (updatableAnimationState.m1488a(interfaceC2052l, interfaceC2041a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$launchAnimation$1(ContentInViewModifier contentInViewModifier, InterfaceC9968c<? super ContentInViewModifier$launchAnimation$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1970g = contentInViewModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ContentInViewModifier$launchAnimation$1 contentInViewModifier$launchAnimation$1 = new ContentInViewModifier$launchAnimation$1(this.f1970g, interfaceC9968c);
        contentInViewModifier$launchAnimation$1.f1969f = obj;
        return contentInViewModifier$launchAnimation$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ContentInViewModifier$launchAnimation$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1968e;
        CancellationException cancellationException = null;
        ContentInViewModifier contentInViewModifier = this.f1970g;
        try {
            try {
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC7875v0 interfaceC7875v0M352h1 = C0062b.m352h1(((InterfaceC7882z) this.f1969f).getF6528b());
                    contentInViewModifier.f1963k = true;
                    InterfaceC9357j interfaceC9357j = contentInViewModifier.f1955c;
                    C03961 c03961 = new C03961(contentInViewModifier, interfaceC7875v0M352h1, null);
                    this.f1968e = 1;
                    if (interfaceC9357j.mo1417b(MutatePriority.Default, c03961, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                contentInViewModifier.f1957e.m1490b();
                contentInViewModifier.f1963k = false;
                contentInViewModifier.f1957e.m1489a(null);
                contentInViewModifier.f1961i = false;
                return C9072e.f47360a;
            } catch (CancellationException e10) {
                cancellationException = e10;
                throw cancellationException;
            }
        } catch (Throwable th2) {
            contentInViewModifier.f1963k = false;
            contentInViewModifier.f1957e.m1489a(cancellationException);
            contentInViewModifier.f1961i = false;
            throw th2;
        }
    }
}
