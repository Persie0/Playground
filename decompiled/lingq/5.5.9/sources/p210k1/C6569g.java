package p210k1;

/* JADX INFO: renamed from: k1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6569g {

    /* JADX INFO: renamed from: a */
    public final int f37368a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6569g) {
            return this.f37368a == ((C6569g) obj).f37368a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37368a);
    }

    public final String toString() {
        int i10 = this.f37368a;
        if (i10 == 0) {
            return "Button";
        }
        if (i10 == 1) {
            return "Checkbox";
        }
        if (i10 == 2) {
            return "Switch";
        }
        if (i10 == 3) {
            return "RadioButton";
        }
        if (i10 == 4) {
            return "Tab";
        }
        if (i10 == 5) {
            return "Image";
        }
        return i10 == 6 ? "DropdownList" : "Unknown";
    }
}
