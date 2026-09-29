package p000;

/* JADX INFO: loaded from: classes.dex */
public final class er3 {

    /* JADX INFO: renamed from: a */
    public final int f37744a;

    public final boolean equals(Object obj) {
        if (obj instanceof er3) {
            return this.f37744a == ((er3) obj).f37744a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37744a);
    }

    public final String toString() {
        int i = this.f37744a;
        if (i == 16) {
            return "Confirm";
        }
        if (i == 6) {
            return "ContextClick";
        }
        if (i == 13) {
            return "GestureEnd";
        }
        if (i == 23) {
            return "GestureThresholdActivate";
        }
        if (i == 3) {
            return "KeyboardTap";
        }
        if (i == 0) {
            return "LongPress";
        }
        if (i == 17) {
            return "Reject";
        }
        if (i == 27) {
            return "SegmentFrequentTick";
        }
        if (i == 26) {
            return "SegmentTick";
        }
        if (i == 9) {
            return "TextHandleMove";
        }
        if (i == 22) {
            return "ToggleOff";
        }
        if (i == 21) {
            return "ToggleOn";
        }
        return i == 1 ? "VirtualKey" : "Invalid";
    }
}
