package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: androidx.emoji2.text.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0894h extends C0892f.i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0892f.i f6006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f6007b;

    public C0894h(C0892f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f6006a = iVar;
        this.f6007b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.C0892f.i
    /* JADX INFO: renamed from: a */
    public final void mo3517a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f6007b;
        try {
            this.f6006a.mo3517a(th2);
            threadPoolExecutor.shutdown();
        } catch (Throwable th3) {
            threadPoolExecutor.shutdown();
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.emoji2.text.C0892f.i
    /* JADX INFO: renamed from: b */
    public final void mo3518b(C0901o c0901o) {
        ThreadPoolExecutor threadPoolExecutor = this.f6007b;
        try {
            this.f6006a.mo3518b(c0901o);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
