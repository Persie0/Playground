package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class cc1 implements Continuation {

    /* JADX INFO: renamed from: b */
    public static final cc1 f9874b = new cc1(0);

    /* JADX INFO: renamed from: c */
    public static final cc1 f9875c = new cc1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9876a;

    public /* synthetic */ cc1(int i) {
        this.f9876a = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m4500a(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        switch (this.f9876a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return EmptyCoroutineContext.f47685a;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        switch (this.f9876a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f9876a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
