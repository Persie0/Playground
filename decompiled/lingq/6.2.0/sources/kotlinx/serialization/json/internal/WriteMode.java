package kotlinx.serialization.json.internal;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum WriteMode {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public final char begin;
    public final char end;

    WriteMode(char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
