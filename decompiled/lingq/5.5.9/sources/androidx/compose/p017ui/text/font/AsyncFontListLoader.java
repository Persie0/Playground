package androidx.compose.p017ui.text.font;

import ae.C0062b;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.TimeoutKt;
import no.InterfaceC7878x;
import p081e0.InterfaceC5301c1;
import p260m8.C7499b;
import p328q1.C8486w;
import p328q1.InterfaceC8468e;
import p328q1.InterfaceC8479p;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncFontListLoader implements InterfaceC5301c1<Object> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC8468e> f4583a;

    /* JADX INFO: renamed from: b */
    public final C8486w f4584b;

    /* JADX INFO: renamed from: c */
    public final C0695a f4585c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2052l<InterfaceC0703i.b, C9072e> f4586d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8479p f4587e;

    /* JADX INFO: renamed from: f */
    public final ParcelableSnapshotMutableState f4588f;

    /* JADX INFO: renamed from: g */
    public boolean f4589g;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends InterfaceC8468e> list, Object obj, C8486w c8486w, C0695a c0695a, InterfaceC2052l<? super InterfaceC0703i.b, C9072e> interfaceC2052l, InterfaceC8479p interfaceC8479p) {
        C5207g.m11111f(obj, "initialType");
        C5207g.m11111f(c0695a, "asyncTypefaceCache");
        C5207g.m11111f(interfaceC2052l, "onCompletion");
        this.f4583a = list;
        this.f4584b = c8486w;
        this.f4585c = c0695a;
        this.f4586d = interfaceC2052l;
        this.f4587e = interfaceC8479p;
        this.f4588f = C8573r0.m16684L0(obj);
        this.f4589g = true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #3 {all -> 0x00dc, blocks: (B:27:0x0062, B:32:0x0073), top: B:62:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:37:0x0095, B:42:0x00c4, B:20:0x004b), top: B:56:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[Catch: all -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:37:0x0095, B:42:0x00c4, B:20:0x004b), top: B:56:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d7 -> B:46:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x00d7
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m2591e(p464wl.InterfaceC9968c<? super sl.C9072e> r15) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.text.font.AsyncFontListLoader.m2591e(wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final Object m2592f(InterfaceC8468e interfaceC8468e, InterfaceC9968c<Object> interfaceC9968c) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (interfaceC9968c instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) interfaceC9968c;
            int i10 = asyncFontListLoader$loadWithTimeoutOrNull$1.f4604g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.f4604g = i10 - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, interfaceC9968c);
            }
        } else {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, interfaceC9968c);
        }
        Object objM14314b = asyncFontListLoader$loadWithTimeoutOrNull$1.f4602e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = asyncFontListLoader$loadWithTimeoutOrNull$1.f4604g;
        Object obj = null;
        CoroutineContext coroutineContext = asyncFontListLoader$loadWithTimeoutOrNull$1.f38105b;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(objM14314b);
                AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, interfaceC8468e, null);
                asyncFontListLoader$loadWithTimeoutOrNull$1.f4601d = interfaceC8468e;
                asyncFontListLoader$loadWithTimeoutOrNull$1.f4604g = 1;
                objM14314b = TimeoutKt.m14314b(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                if (objM14314b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC8468e = asyncFontListLoader$loadWithTimeoutOrNull$1.f4601d;
                C7499b.m14977z0(objM14314b);
            }
            obj = objM14314b;
            return obj;
        } catch (CancellationException e10) {
            C5207g.m11108c(coroutineContext);
            if (C0062b.m394s1(coroutineContext)) {
                return obj;
            }
            throw e10;
        } catch (Exception e11) {
            C5207g.m11108c(coroutineContext);
            InterfaceC7878x interfaceC7878x = (InterfaceC7878x) coroutineContext.mo1474w(InterfaceC7878x.a.f42977a);
            if (interfaceC7878x == null) {
                return obj;
            }
            interfaceC7878x.mo2598p1(coroutineContext, new IllegalStateException("Unable to load font " + interfaceC8468e, e11));
            return obj;
        }
    }

    @Override // p081e0.InterfaceC5301c1
    public final Object getValue() {
        return this.f4588f.getValue();
    }
}
