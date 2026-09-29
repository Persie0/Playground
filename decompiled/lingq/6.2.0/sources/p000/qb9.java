package p000;

import com.facebook.internal.SmartLoginOption;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class qb9 {
    /* JADX INFO: renamed from: a */
    public static EnumSet m19848a(long j) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(SmartLoginOption.class);
        for (SmartLoginOption smartLoginOption : SmartLoginOption.ALL) {
            if ((smartLoginOption.getValue() & j) != 0) {
                enumSetNoneOf.add(smartLoginOption);
            }
        }
        enumSetNoneOf.getClass();
        return enumSetNoneOf;
    }
}
