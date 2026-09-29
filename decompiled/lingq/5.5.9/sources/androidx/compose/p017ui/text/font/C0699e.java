package androidx.compose.p017ui.text.font;

import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.C7155e;
import no.C7851m1;
import no.InterfaceC7878x;
import p260m8.C7499b;
import p464wl.AbstractC9966a;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0699e {

    /* JADX INFO: renamed from: c */
    public static final a f4636c = new a();

    /* JADX INFO: renamed from: a */
    public final C0695a f4637a;

    /* JADX INFO: renamed from: b */
    public final C7155e f4638b;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.e$a */
    public static final class a extends AbstractC9966a implements InterfaceC7878x {
        public a() {
            super(InterfaceC7878x.a.f42977a);
        }

        @Override // no.InterfaceC7878x
        /* JADX INFO: renamed from: p1 */
        public final void mo2598p1(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    public C0699e(C0695a c0695a) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f38093a;
        C5207g.m11111f(c0695a, "asyncTypefaceCache");
        C5207g.m11111f(emptyCoroutineContext, "injectedContext");
        this.f4637a = c0695a;
        a aVar = f4636c;
        aVar.getClass();
        this.f4638b = C7499b.m14930b(CoroutineContext.DefaultImpls.m13470a(aVar, emptyCoroutineContext).mo1471C(new C7851m1(null)));
    }
}
