package androidx.compose.p017ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import androidx.view.ViewTreeLifecycleOwner;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C7155e;
import no.C7828f;
import p081e0.C5347y;
import p081e0.InterfaceC5297b0;
import p260m8.C7499b;
import p284o0.InterfaceC7887c;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0671v1 {

    /* JADX INFO: renamed from: a */
    public static final a f4357a = a.f4358a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.v1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f4358a = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.v1$a$a, reason: collision with other inner class name */
        public static final class C10589a implements InterfaceC0671v1 {

            /* JADX INFO: renamed from: b */
            public static final C10589a f4359b = new C10589a();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.coroutines.CoroutineContext] */
            /* JADX WARN: Type inference failed for: r1v10, types: [T, androidx.compose.ui.platform.v0] */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.coroutines.CoroutineContext] */
            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // androidx.compose.p017ui.platform.InterfaceC0671v1
            /* JADX INFO: renamed from: a */
            public final Recomposer mo2495a(final View view) {
                CoroutineContext value;
                PausableMonotonicFrameClock pausableMonotonicFrameClock;
                LinkedHashMap linkedHashMap = C0604a2.f4280a;
                CoroutineContext coroutineContext = EmptyCoroutineContext.f38093a;
                C5207g.m11111f(coroutineContext, "coroutineContext");
                InterfaceC5297b0.a aVar = InterfaceC5297b0.a.f33571a;
                InterfaceC9070c<CoroutineContext> interfaceC9070c = AndroidUiDispatcher.f4106H;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    value = AndroidUiDispatcher.f4106H.getValue();
                } else {
                    value = AndroidUiDispatcher.f4107I.get();
                    if (value == null) {
                        throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                    }
                }
                CoroutineContext coroutineContextMo1471C = value.mo1471C(coroutineContext);
                InterfaceC5297b0 interfaceC5297b0 = (InterfaceC5297b0) coroutineContextMo1471C.mo1474w(aVar);
                C1052r c1052rMo786G = null;
                if (interfaceC5297b0 != null) {
                    pausableMonotonicFrameClock = new PausableMonotonicFrameClock(interfaceC5297b0);
                    C5347y c5347y = pausableMonotonicFrameClock.f3040b;
                    synchronized (c5347y.f33644a) {
                        c5347y.f33647d = false;
                        C9072e c9072e = C9072e.f47360a;
                    }
                } else {
                    pausableMonotonicFrameClock = null;
                }
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC7887c interfaceC7887c = (InterfaceC7887c) coroutineContextMo1471C.mo1474w(InterfaceC7887c.a.f43002a);
                ?? r10 = interfaceC7887c;
                if (interfaceC7887c == null) {
                    ?? c0670v0 = new C0670v0();
                    ref$ObjectRef.f38127a = c0670v0;
                    r10 = c0670v0;
                }
                if (pausableMonotonicFrameClock != null) {
                    coroutineContext = pausableMonotonicFrameClock;
                }
                CoroutineContext coroutineContextMo1471C2 = coroutineContextMo1471C.mo1471C(coroutineContext).mo1471C(r10);
                final Recomposer recomposer = new Recomposer(coroutineContextMo1471C2);
                final C7155e c7155eM14930b = C7499b.m14930b(coroutineContextMo1471C2);
                InterfaceC1051q interfaceC1051qM3911a = ViewTreeLifecycleOwner.m3911a(view);
                if (interfaceC1051qM3911a != null) {
                    c1052rMo786G = interfaceC1051qM3911a.mo786G();
                }
                C1052r c1052r = c1052rMo786G;
                if (c1052r == null) {
                    throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
                }
                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0680y1(view, recomposer));
                final PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock;
                c1052r.mo3883a(new InterfaceC1049o() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                    /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a */
                    public /* synthetic */ class a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f4242a;

                        static {
                            int[] iArr = new int[Lifecycle.Event.values().length];
                            try {
                                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                            } catch (NoSuchFieldError unused7) {
                            }
                            f4242a = iArr;
                        }
                    }

                    @Override // androidx.view.InterfaceC1049o
                    /* JADX INFO: renamed from: e */
                    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                        boolean z10;
                        int i10 = a.f4242a[event.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock2;
                                if (pausableMonotonicFrameClock3 != null) {
                                    C5347y c5347y2 = pausableMonotonicFrameClock3.f3040b;
                                    synchronized (c5347y2.f33644a) {
                                        synchronized (c5347y2.f33644a) {
                                            try {
                                                z10 = c5347y2.f33647d;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        if (z10) {
                                            return;
                                        }
                                        List<InterfaceC9968c<C9072e>> list = c5347y2.f33645b;
                                        c5347y2.f33645b = c5347y2.f33646c;
                                        c5347y2.f33646c = list;
                                        c5347y2.f33647d = true;
                                        int size = list.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            list.get(i11).mo2031y(C9072e.f47360a);
                                        }
                                        list.clear();
                                        C9072e c9072e2 = C9072e.f47360a;
                                    }
                                }
                            } else {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        return;
                                    }
                                    recomposer.m1710s();
                                    return;
                                }
                                PausableMonotonicFrameClock pausableMonotonicFrameClock4 = pausableMonotonicFrameClock2;
                                if (pausableMonotonicFrameClock4 != null) {
                                    C5347y c5347y3 = pausableMonotonicFrameClock4.f3040b;
                                    synchronized (c5347y3.f33644a) {
                                        c5347y3.f33647d = false;
                                        C9072e c9072e3 = C9072e.f47360a;
                                    }
                                }
                            }
                        } else {
                            C7828f.m15570d(c7155eM14930b, null, CoroutineStart.UNDISPATCHED, new C0598x149b840a(ref$ObjectRef, recomposer, interfaceC1051q, this, view, null), 1);
                        }
                    }
                });
                return recomposer;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    Recomposer mo2495a(View view);
}
