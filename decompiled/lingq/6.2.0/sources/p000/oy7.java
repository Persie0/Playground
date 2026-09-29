package p000;

import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oy7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderProgressBar f55309b;

    public /* synthetic */ oy7(ReaderProgressBar readerProgressBar, int i) {
        this.f55308a = i;
        this.f55309b = readerProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f55308a;
        ReaderProgressBar readerProgressBar = this.f55309b;
        switch (i) {
            case 0:
                ReaderProgressBar.m9417a(readerProgressBar);
                break;
            case 1:
                int i2 = ReaderProgressBar.f30401n0;
                readerProgressBar.m9422c(readerProgressBar.f30411Q);
                break;
            case 2:
                ReaderProgressBar.setCompletedPages$lambda$0(readerProgressBar);
                break;
            default:
                int i3 = ReaderProgressBar.f30401n0;
                readerProgressBar.m9430n();
                break;
        }
    }
}
