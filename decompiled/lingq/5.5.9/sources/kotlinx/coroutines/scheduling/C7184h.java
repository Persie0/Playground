package kotlinx.coroutines.scheduling;

import p399te.InterfaceC9279a;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C7184h implements InterfaceC7183g, InterfaceC9279a {

    /* JADX INFO: renamed from: a */
    public final int f40480a;

    public C7184h() {
        this.f40480a = 1024;
    }

    public C7184h(int i10) {
        this.f40480a = i10;
    }

    @Override // kotlinx.coroutines.scheduling.InterfaceC7183g
    /* JADX INFO: renamed from: a */
    public void mo14491a() {
    }

    @Override // p399te.InterfaceC9279a
    /* JADX INFO: renamed from: b */
    public StackTraceElement[] mo11675b(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f40480a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }

    @Override // kotlinx.coroutines.scheduling.InterfaceC7183g
    /* JADX INFO: renamed from: c */
    public int mo14492c() {
        return this.f40480a;
    }
}
