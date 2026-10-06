package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gst {
    INACTIVE(0),
    PASSIVE_SCAN(1),
    PASSIVE_FOCUSED(2),
    ACTIVE_SCAN(3),
    FOCUSED_LOCKED(4),
    NOT_FOCUSED_LOCKED(5),
    PASSIVE_UNFOCUSED(6);


    /* JADX INFO: renamed from: i */
    private static final Map f26283i = new HashMap();

    /* JADX INFO: renamed from: h */
    public final int f26285h;

    static {
        for (gst gstVar : values()) {
            f26283i.put(Integer.valueOf(gstVar.f26285h), gstVar);
        }
    }

    gst(int i) {
        this.f26285h = i;
    }

    /* JADX INFO: renamed from: a */
    public static gst m9711a(int i) {
        gst gstVar = (gst) f26283i.get(Integer.valueOf(i));
        if (gstVar != null) {
            return gstVar;
        }
        throw new IllegalArgumentException("unknown metadata value: " + i);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9712b() {
        return this == PASSIVE_FOCUSED || this == PASSIVE_UNFOCUSED || this == FOCUSED_LOCKED || this == NOT_FOCUSED_LOCKED || this == INACTIVE;
    }
}
