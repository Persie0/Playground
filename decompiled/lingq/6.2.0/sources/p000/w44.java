package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w44 {

    /* JADX INFO: renamed from: a */
    public final boolean f66374a;

    /* JADX INFO: renamed from: b */
    public final String f66375b;

    public w44(int i) {
        switch (i) {
            case 1:
                this.f66374a = false;
                this.f66375b = "";
                break;
            default:
                this.f66375b = "";
                this.f66374a = true;
                break;
        }
    }

    public w44(String str, boolean z) {
        this.f66375b = str;
        this.f66374a = z;
    }

    public w44(boolean z, String str) {
        this.f66374a = z;
        this.f66375b = str;
    }
}
