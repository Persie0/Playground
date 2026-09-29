package p000;

import com.google.common.collect.ImmutableList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ak3 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f762c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f763a = -1;

    /* JADX INFO: renamed from: b */
    public int f764b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m527a(String str) {
        Matcher matcher = f762c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = uma.f64080a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f763a = i;
            this.f764b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX INFO: renamed from: b */
    public final void m528b(ey5 ey5Var) {
        dy5 dy5Var;
        ey5Var.getClass();
        c14 c14VarM6284m = ImmutableList.m6284m();
        dy5[] dy5VarArr = ey5Var.f38074a;
        int length = dy5VarArr.length;
        int i = 0;
        while (true) {
            dy5 dy5Var2 = null;
            if (i >= length) {
                break;
            }
            dy5 dy5Var3 = dy5VarArr[i];
            if (gb1.class.isAssignableFrom(dy5Var3.getClass())) {
                dy5 dy5Var4 = (dy5) gb1.class.cast(dy5Var3);
                if (((gb1) dy5Var4).f40484c.equals("iTunSMPB")) {
                    dy5Var2 = dy5Var4;
                }
            }
            if (dy5Var2 != null) {
                c14VarM6284m.m3157b(dy5Var2);
            }
            i++;
        }
        d14 d14VarListIterator = c14VarM6284m.m4280g().listIterator(0);
        while (d14VarListIterator.hasNext()) {
            if (m527a(((gb1) d14VarListIterator.next()).f40485d)) {
                return;
            }
        }
        c14 c14VarM6284m2 = ImmutableList.m6284m();
        for (dy5 dy5Var5 : dy5VarArr) {
            if (r94.class.isAssignableFrom(dy5Var5.getClass())) {
                dy5Var = (dy5) r94.class.cast(dy5Var5);
                r94 r94Var = (r94) dy5Var;
                if (!(r94Var.f58941b.equals("com.apple.iTunes") && r94Var.f58942c.equals("iTunSMPB"))) {
                    dy5Var = null;
                }
            } else {
                dy5Var = null;
            }
            if (dy5Var != null) {
                c14VarM6284m2.m3157b(dy5Var);
            }
        }
        d14 d14VarListIterator2 = c14VarM6284m2.m4280g().listIterator(0);
        while (d14VarListIterator2.hasNext() && !m527a(((r94) d14VarListIterator2.next()).f58943d)) {
        }
    }
}
