package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kuf implements InterfaceC1134xw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f37215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37216b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37217c;

    public /* synthetic */ kuf(hbs hbsVar, hbr hbrVar, int i) {
        this.f37217c = i;
        this.f37215a = hbsVar;
        this.f37216b = hbrVar;
    }

    public /* synthetic */ kuf(Runnable runnable, Context context, int i) {
        this.f37217c = i;
        this.f37215a = runnable;
        this.f37216b = context;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.InterfaceC1134xw
    /* JADX INFO: renamed from: a */
    public final Object mo10974a(C1132xu c1132xu) {
        switch (this.f37217c) {
            case 0:
                ?? r0 = this.f37215a;
                Object obj = this.f37216b;
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                kug kugVar = new kug(atomicBoolean, r0, c1132xu);
                Context context = (Context) obj;
                context.registerReceiver(kugVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                if (kuh.m14889d(context) && atomicBoolean.compareAndSet(false, true)) {
                    context.unregisterReceiver(kugVar);
                    r0.run();
                    c1132xu.m19591a(null);
                    return "DirectBootUtils.runWhenUnlocked";
                }
                kha khaVar = new kha(atomicBoolean, context, kugVar, 3);
                not notVar = not.INSTANCE;
                C1137xz c1137xz = c1132xu.f48036c;
                if (c1137xz == null) {
                    return "DirectBootUtils.runWhenUnlocked";
                }
                c1137xz.mo2282d(khaVar, notVar);
                return "DirectBootUtils.runWhenUnlocked";
            default:
                Object obj2 = this.f37215a;
                Object obj3 = this.f37216b;
                ((hbr) obj3).f27157a = c1132xu;
                hbs hbsVar = (hbs) obj2;
                hbsVar.f27165b.registerAvailabilityCallback(hbsVar.f27166c, (CameraManager.AvailabilityCallback) obj3);
                return "SidelineCameraStateChecker#waitForCamerasAllAvailable";
        }
    }
}
