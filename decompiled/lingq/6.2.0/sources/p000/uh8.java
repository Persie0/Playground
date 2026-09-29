package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uh8 {

    /* JADX INFO: renamed from: a */
    public final int f63934a;

    public final boolean equals(Object obj) {
        if (obj instanceof uh8) {
            return this.f63934a == ((uh8) obj).f63934a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63934a);
    }

    public final String toString() {
        int i = this.f63934a;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        if (i == 6) {
            return "DropdownList";
        }
        if (i == 7) {
            return "Picker";
        }
        return i == 8 ? "Carousel" : "Unknown";
    }
}
