package p000;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: vh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1065vh extends ood implements omx {

    /* JADX INFO: renamed from: a */
    public static final C1065vh f47843a = new C1065vh(2);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f47844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065vh(int i) {
        super(0);
        this.f47844b = i;
    }

    @Override // p000.omx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2077a() {
        WindowLayoutComponent windowLayoutComponentM2209c;
        switch (this.f47844b) {
            case 0:
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", -3);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 1:
                int[] iArr = C1067vj.f47847a;
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, C1067vj.m19501b(C1067vj.m19502c(C1067vj.f47848b, "CXCP-Camera-E"), -3));
                executorServiceNewFixedThreadPool.getClass();
                return executorServiceNewFixedThreadPool;
            default:
                try {
                    ClassLoader classLoader = awt.class.getClassLoader();
                    bck bckVar = classLoader != null ? new bck(classLoader, new awc(classLoader)) : null;
                    if (bckVar == null || (windowLayoutComponentM2209c = bckVar.m2209c()) == null) {
                        return null;
                    }
                    classLoader.getClass();
                    return new axc(windowLayoutComponentM2209c, new awc(classLoader));
                } catch (Throwable th) {
                    ojy ojyVar = aws.f2611a;
                    return null;
                }
        }
    }
}
