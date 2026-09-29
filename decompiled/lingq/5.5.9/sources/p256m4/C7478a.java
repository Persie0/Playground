package p256m4;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.room.Index$Order;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.text.C7076b;
import mo.C7661i;
import p003a2.C0009a;
import p260m8.C7499b;
import p385sf.C9000b;

/* JADX INFO: renamed from: m4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7478a {

    /* JADX INFO: renamed from: a */
    public final String f41328a;

    /* JADX INFO: renamed from: b */
    public final Map<String, a> f41329b;

    /* JADX INFO: renamed from: c */
    public final Set<b> f41330c;

    /* JADX INFO: renamed from: d */
    public final Set<d> f41331d;

    /* JADX INFO: renamed from: m4.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f41332a;

        /* JADX INFO: renamed from: b */
        public final String f41333b;

        /* JADX INFO: renamed from: c */
        public final boolean f41334c;

        /* JADX INFO: renamed from: d */
        public final int f41335d;

        /* JADX INFO: renamed from: e */
        public final String f41336e;

        /* JADX INFO: renamed from: f */
        public final int f41337f;

        /* JADX INFO: renamed from: g */
        public final int f41338g;

        /* JADX INFO: renamed from: m4.a$a$a, reason: collision with other inner class name */
        public static final class C10650a {
            /* JADX WARN: Code duplicated, block: B:33:0x0064  */
            /* JADX WARN: Code duplicated, block: B:35:0x0081 A[RETURN] */
            @SuppressLint({"SyntheticAccessor"})
            /* JADX INFO: renamed from: a */
            public static boolean m14862a(String str, String str2) {
                boolean z10;
                C5207g.m11111f(str, "current");
                if (C5207g.m11106a(str, str2)) {
                    return true;
                }
                if (!(str.length() == 0)) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i10 >= str.length()) {
                            if (i11 == 0) {
                                z10 = true;
                                break;
                            }
                        } else {
                            char cCharAt = str.charAt(i10);
                            int i13 = i12 + 1;
                            if (i12 != 0 || cCharAt == '(') {
                                if (cCharAt == '(') {
                                    i11++;
                                } else if (cCharAt != ')' || (i11 = i11 - 1) != 0 || i12 == str.length() - 1) {
                                }
                                i10++;
                                i12 = i13;
                            }
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    String strSubstring = str.substring(1, str.length() - 1);
                    C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return C5207g.m11106a(C7076b.m14277B3(strSubstring).toString(), str2);
                }
                z10 = false;
                if (z10) {
                    return false;
                }
                String strSubstring2 = str.substring(1, str.length() - 1);
                C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return C5207g.m11106a(C7076b.m14277B3(strSubstring2).toString(), str2);
            }
        }

        public a(int i10, int i11, String str, String str2, String str3, boolean z10) {
            this.f41332a = str;
            this.f41333b = str2;
            this.f41334c = z10;
            this.f41335d = i10;
            this.f41336e = str3;
            this.f41337f = i11;
            Locale locale = Locale.US;
            C5207g.m11110e(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            this.f41338g = C7076b.m14278X2(upperCase, "INT", false) ? 3 : (C7076b.m14278X2(upperCase, "CHAR", false) || C7076b.m14278X2(upperCase, "CLOB", false) || C7076b.m14278X2(upperCase, "TEXT", false)) ? 2 : C7076b.m14278X2(upperCase, "BLOB", false) ? 5 : (C7076b.m14278X2(upperCase, "REAL", false) || C7076b.m14278X2(upperCase, "FLOA", false) || C7076b.m14278X2(upperCase, "DOUB", false)) ? 4 : 1;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0070  */
        public final boolean equals(Object obj) {
            boolean z10;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f41335d != aVar.f41335d) {
                return false;
            }
            if (!C5207g.m11106a(this.f41332a, aVar.f41332a) || this.f41334c != aVar.f41334c) {
                return false;
            }
            int i10 = aVar.f41337f;
            String str = aVar.f41336e;
            String str2 = this.f41336e;
            int i11 = this.f41337f;
            if (i11 == 1 && i10 == 2 && str2 != null && !C10650a.m14862a(str2, str)) {
                return false;
            }
            if (i11 == 2 && i10 == 1 && str != null && !C10650a.m14862a(str, str2)) {
                return false;
            }
            if (i11 != 0 && i11 == i10) {
                if (str2 != null) {
                    if (C10650a.m14862a(str2, str)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return false;
                }
            }
            return this.f41338g == aVar.f41338g;
        }

        public final int hashCode() {
            return (((((this.f41332a.hashCode() * 31) + this.f41338g) * 31) + (this.f41334c ? 1231 : 1237)) * 31) + this.f41335d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f41332a);
            sb2.append("', type='");
            sb2.append(this.f41333b);
            sb2.append("', affinity='");
            sb2.append(this.f41338g);
            sb2.append("', notNull=");
            sb2.append(this.f41334c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f41335d);
            sb2.append(", defaultValue='");
            String str = this.f41336e;
            if (str == null) {
                str = "undefined";
            }
            return C0009a.m23l(sb2, str, "'}");
        }
    }

    /* JADX INFO: renamed from: m4.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f41339a;

        /* JADX INFO: renamed from: b */
        public final String f41340b;

        /* JADX INFO: renamed from: c */
        public final String f41341c;

        /* JADX INFO: renamed from: d */
        public final List<String> f41342d;

        /* JADX INFO: renamed from: e */
        public final List<String> f41343e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            C5207g.m11111f(list, "columnNames");
            C5207g.m11111f(list2, "referenceColumnNames");
            this.f41339a = str;
            this.f41340b = str2;
            this.f41341c = str3;
            this.f41342d = list;
            this.f41343e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C5207g.m11106a(this.f41339a, bVar.f41339a) && C5207g.m11106a(this.f41340b, bVar.f41340b) && C5207g.m11106a(this.f41341c, bVar.f41341c) && C5207g.m11106a(this.f41342d, bVar.f41342d)) {
                return C5207g.m11106a(this.f41343e, bVar.f41343e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f41343e.hashCode() + C0204c.m848g(this.f41342d, C0166e.m758d(this.f41341c, C0166e.m758d(this.f41340b, this.f41339a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f41339a + "', onDelete='" + this.f41340b + " +', onUpdate='" + this.f41341c + "', columnNames=" + this.f41342d + ", referenceColumnNames=" + this.f41343e + '}';
        }
    }

    /* JADX INFO: renamed from: m4.a$c */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a */
        public final int f41344a;

        /* JADX INFO: renamed from: b */
        public final int f41345b;

        /* JADX INFO: renamed from: c */
        public final String f41346c;

        /* JADX INFO: renamed from: d */
        public final String f41347d;

        public c(String str, int i10, int i11, String str2) {
            this.f41344a = i10;
            this.f41345b = i11;
            this.f41346c = str;
            this.f41347d = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            C5207g.m11111f(cVar2, "other");
            int i10 = this.f41344a - cVar2.f41344a;
            return i10 == 0 ? this.f41345b - cVar2.f41345b : i10;
        }
    }

    /* JADX INFO: renamed from: m4.a$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f41348a;

        /* JADX INFO: renamed from: b */
        public final boolean f41349b;

        /* JADX INFO: renamed from: c */
        public final List<String> f41350c;

        /* JADX INFO: renamed from: d */
        public final List<String> f41351d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Collection, java.util.List, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
        public d(String str, List list, List list2, boolean z10) {
            C5207g.m11111f(list, "columns");
            C5207g.m11111f(list2, "orders");
            this.f41348a = str;
            this.f41349b = z10;
            this.f41350c = list;
            this.f41351d = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list2.add(Index$Order.ASC.name());
                }
            }
            this.f41351d = list2;
        }

        public d(String str, List list, boolean z10) {
            C5207g.m11111f(list, "columns");
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(Index$Order.ASC.name());
            }
            this(str, list, arrayList, z10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f41349b == dVar.f41349b && C5207g.m11106a(this.f41350c, dVar.f41350c) && C5207g.m11106a(this.f41351d, dVar.f41351d)) {
                String str = this.f41348a;
                boolean zM15256V2 = C7661i.m15256V2(str, "index_", false);
                String str2 = dVar.f41348a;
                return zM15256V2 ? C7661i.m15256V2(str2, "index_", false) : C5207g.m11106a(str, str2);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f41348a;
            return this.f41351d.hashCode() + C0204c.m848g(this.f41350c, (((C7661i.m15256V2(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f41349b ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Index{name='");
            sb2.append(this.f41348a);
            sb2.append("', unique=");
            sb2.append(this.f41349b);
            sb2.append(", columns=");
            sb2.append(this.f41350c);
            sb2.append(", orders=");
            return C0009a.m24m(sb2, this.f41351d, "'}");
        }
    }

    public C7478a(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f41328a = str;
        this.f41329b = map;
        this.f41330c = abstractSet;
        this.f41331d = abstractSet2;
    }

    /* JADX INFO: renamed from: a */
    public static final C7478a m14861a(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str) throws IOException {
        Map mapM13459L0;
        SetBuilder setBuilder;
        int i10;
        Throwable th2;
        d dVar;
        StringBuilder sb2 = new StringBuilder("PRAGMA table_info(`");
        sb2.append(str);
        String str2 = "`)";
        sb2.append("`)");
        Cursor cursorMo4599o0 = frameworkSQLiteDatabase.mo4599o0(sb2.toString());
        try {
            Cursor cursor = cursorMo4599o0;
            String str3 = "name";
            if (cursor.getColumnCount() <= 0) {
                mapM13459L0 = C6753d.m13459L0();
                C5206f.m11032z0(cursorMo4599o0, null);
            } else {
                int columnIndex = cursor.getColumnIndex("name");
                int columnIndex2 = cursor.getColumnIndex("type");
                int columnIndex3 = cursor.getColumnIndex("notnull");
                int columnIndex4 = cursor.getColumnIndex("pk");
                int columnIndex5 = cursor.getColumnIndex("dflt_value");
                MapBuilder mapBuilder = new MapBuilder();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(columnIndex);
                    int i11 = columnIndex;
                    String string2 = cursor.getString(columnIndex2);
                    boolean z10 = cursor.getInt(columnIndex3) != 0;
                    int i12 = cursor.getInt(columnIndex4);
                    String string3 = cursor.getString(columnIndex5);
                    C5207g.m11110e(string, "name");
                    C5207g.m11110e(string2, "type");
                    mapBuilder.put(string, new a(i12, 2, string, string2, string3, z10));
                    columnIndex = i11;
                    cursor = cursor;
                }
                mapBuilder.m13403b();
                mapBuilder.f38069l = true;
                C5206f.m11032z0(cursorMo4599o0, null);
                mapM13459L0 = mapBuilder;
            }
            Cursor cursorMo4599o1 = frameworkSQLiteDatabase.mo4599o0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                Cursor cursor2 = cursorMo4599o1;
                int columnIndex6 = cursor2.getColumnIndex("id");
                int columnIndex7 = cursor2.getColumnIndex("seq");
                int columnIndex8 = cursor2.getColumnIndex("table");
                int columnIndex9 = cursor2.getColumnIndex("on_delete");
                int columnIndex10 = cursor2.getColumnIndex("on_update");
                int columnIndex11 = cursor2.getColumnIndex("id");
                int columnIndex12 = cursor2.getColumnIndex("seq");
                int columnIndex13 = cursor2.getColumnIndex("from");
                int columnIndex14 = cursor2.getColumnIndex("to");
                Map map = mapM13459L0;
                ListBuilder listBuilder = new ListBuilder();
                while (cursor2.moveToNext()) {
                    int i13 = cursor2.getInt(columnIndex11);
                    int i14 = columnIndex11;
                    int i15 = cursor2.getInt(columnIndex12);
                    int i16 = columnIndex12;
                    String string4 = cursor2.getString(columnIndex13);
                    int i17 = columnIndex13;
                    C5207g.m11110e(string4, "cursor.getString(fromColumnIndex)");
                    String string5 = cursor2.getString(columnIndex14);
                    C5207g.m11110e(string5, "cursor.getString(toColumnIndex)");
                    listBuilder.add(new c(string4, i13, i15, string5));
                    str3 = str3;
                    columnIndex11 = i14;
                    columnIndex12 = i16;
                    columnIndex13 = i17;
                    columnIndex14 = columnIndex14;
                }
                String str4 = str3;
                C9000b.m17239e(listBuilder);
                List listM13446n0 = C6752c.m13446n0(listBuilder);
                cursor2.moveToPosition(-1);
                SetBuilder setBuilder2 = new SetBuilder();
                while (cursor2.moveToNext()) {
                    if (cursor2.getInt(columnIndex7) == 0) {
                        int i18 = cursor2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<c> arrayList3 = new ArrayList();
                        for (Object obj : listM13446n0) {
                            List list = listM13446n0;
                            if (((c) obj).f41344a == i18) {
                                arrayList3.add(obj);
                            }
                            listM13446n0 = list;
                        }
                        List list2 = listM13446n0;
                        for (c cVar : arrayList3) {
                            arrayList.add(cVar.f41346c);
                            arrayList2.add(cVar.f41347d);
                        }
                        String string6 = cursor2.getString(columnIndex8);
                        C5207g.m11110e(string6, "cursor.getString(tableColumnIndex)");
                        String string7 = cursor2.getString(columnIndex9);
                        C5207g.m11110e(string7, "cursor.getString(onDeleteColumnIndex)");
                        String string8 = cursor2.getString(columnIndex10);
                        C5207g.m11110e(string8, "cursor.getString(onUpdateColumnIndex)");
                        setBuilder2.add(new b(string6, string7, string8, arrayList, arrayList2));
                        listM13446n0 = list2;
                        cursor2 = cursor2;
                    }
                }
                C7499b.m14940g(setBuilder2);
                C5206f.m11032z0(cursorMo4599o1, null);
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                Cursor cursorMo4599o2 = frameworkSQLiteDatabase2.mo4599o0("PRAGMA index_list(`" + str + "`)");
                try {
                    Cursor cursor3 = cursorMo4599o2;
                    String str5 = str4;
                    int columnIndex15 = cursor3.getColumnIndex(str5);
                    int columnIndex16 = cursor3.getColumnIndex("origin");
                    int columnIndex17 = cursor3.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        C5206f.m11032z0(cursorMo4599o2, null);
                        setBuilder = null;
                    } else {
                        SetBuilder setBuilder3 = new SetBuilder();
                        while (cursor3.moveToNext()) {
                            if (C5207g.m11106a("c", cursor3.getString(columnIndex16))) {
                                String string9 = cursor3.getString(columnIndex15);
                                boolean z11 = cursor3.getInt(columnIndex17) == 1;
                                C5207g.m11110e(string9, str5);
                                Cursor cursorMo4599o3 = frameworkSQLiteDatabase2.mo4599o0("PRAGMA index_xinfo(`" + string9 + str2);
                                try {
                                    Cursor cursor4 = cursorMo4599o3;
                                    int columnIndex18 = cursor4.getColumnIndex("seqno");
                                    Cursor cursor5 = cursor3;
                                    int columnIndex19 = cursor4.getColumnIndex("cid");
                                    int columnIndex20 = cursor4.getColumnIndex(str5);
                                    String str6 = str5;
                                    int columnIndex21 = cursor4.getColumnIndex("desc");
                                    String str7 = str2;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        i10 = columnIndex16;
                                        th2 = null;
                                        C5206f.m11032z0(cursorMo4599o3, null);
                                        dVar = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        TreeMap treeMap2 = new TreeMap();
                                        while (cursor4.moveToNext()) {
                                            if (cursor4.getInt(columnIndex19) >= 0) {
                                                int i19 = cursor4.getInt(columnIndex18);
                                                int i20 = columnIndex19;
                                                String string10 = cursor4.getString(columnIndex20);
                                                int i21 = columnIndex20;
                                                String str8 = cursor4.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i22 = columnIndex21;
                                                Integer numValueOf = Integer.valueOf(i19);
                                                C5207g.m11110e(string10, "columnName");
                                                treeMap.put(numValueOf, string10);
                                                treeMap2.put(Integer.valueOf(i19), str8);
                                                columnIndex19 = i20;
                                                columnIndex21 = i22;
                                                columnIndex20 = i21;
                                                columnIndex16 = columnIndex16;
                                            }
                                        }
                                        i10 = columnIndex16;
                                        Collection collectionValues = treeMap.values();
                                        C5207g.m11110e(collectionValues, "columnsMap.values");
                                        List listM13453u0 = C6752c.m13453u0(collectionValues);
                                        Collection collectionValues2 = treeMap2.values();
                                        C5207g.m11110e(collectionValues2, "ordersMap.values");
                                        dVar = new d(string9, listM13453u0, C6752c.m13453u0(collectionValues2), z11);
                                        C5206f.m11032z0(cursorMo4599o3, null);
                                        th2 = null;
                                    }
                                    if (dVar == null) {
                                        C5206f.m11032z0(cursorMo4599o2, th2);
                                        setBuilder = null;
                                    } else {
                                        setBuilder3.add(dVar);
                                        frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                        cursor3 = cursor5;
                                        str5 = str6;
                                        str2 = str7;
                                        columnIndex15 = columnIndex15;
                                        columnIndex16 = i10;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        C5206f.m11032z0(cursorMo4599o3, th3);
                                        throw th4;
                                    }
                                }
                            }
                        }
                        C7499b.m14940g(setBuilder3);
                        C5206f.m11032z0(cursorMo4599o2, null);
                        setBuilder = setBuilder3;
                    }
                    return new C7478a(str, map, setBuilder2, setBuilder);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        C5206f.m11032z0(cursorMo4599o2, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    C5206f.m11032z0(cursorMo4599o1, th7);
                    throw th8;
                }
            }
        } catch (Throwable th9) {
            try {
                throw th9;
            } catch (Throwable th10) {
                C5206f.m11032z0(cursorMo4599o0, th9);
                throw th10;
            }
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7478a)) {
            return false;
        }
        C7478a c7478a = (C7478a) obj;
        if (!C5207g.m11106a(this.f41328a, c7478a.f41328a) || !C5207g.m11106a(this.f41329b, c7478a.f41329b) || !C5207g.m11106a(this.f41330c, c7478a.f41330c)) {
            return false;
        }
        Set<d> set2 = this.f41331d;
        if (set2 != null && (set = c7478a.f41331d) != null) {
            return C5207g.m11106a(set2, set);
        }
        return true;
    }

    public final int hashCode() {
        return this.f41330c.hashCode() + ((this.f41329b.hashCode() + (this.f41328a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f41328a + "', columns=" + this.f41329b + ", foreignKeys=" + this.f41330c + ", indices=" + this.f41331d + '}';
    }
}
