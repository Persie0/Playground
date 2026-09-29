package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ic2 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f43919a;

    public ic2(int i) {
        switch (i) {
            case 1:
                this.f43919a = new ConcurrentHashMap();
                break;
            default:
                this.f43919a = new ConcurrentHashMap(16);
                break;
        }
    }
}
