package p000;

import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aeb {
    /* JADX INFO: renamed from: a */
    public static int m317a(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m318b(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: c */
    public static final String m319c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
