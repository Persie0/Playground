package p000;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsq {

    /* JADX INFO: renamed from: a */
    public static final Pattern f39139a = Pattern.compile("(\\w+).*");

    /* JADX INFO: renamed from: a */
    public static String m15949a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(lyz.m16212h("+").m16215d(list));
    }
}
