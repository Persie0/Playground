package p000;

import android.database.Cursor;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afe {
    /* JADX INFO: renamed from: a */
    static int m457a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* JADX INFO: renamed from: b */
    static void m458b(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* JADX INFO: renamed from: c */
    static void m459c(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* JADX INFO: renamed from: d */
    static void m460d(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m461e(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m462f(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: g */
    static boolean m463g(View view) {
        return view.isLayoutDirectionResolved();
    }

    /* JADX INFO: renamed from: h */
    public static final aqi m464h(aqp aqpVar, String str) throws IOException {
        Map map;
        List listM18683W;
        Set set;
        aqh aqhVar;
        Throwable th;
        aqpVar = aqpVar;
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(str);
        String str2 = "`)";
        sb.append("`)");
        Cursor cursorMo1863b = aqpVar.mo1863b(sb.toString());
        try {
            String str3 = "name";
            if (cursorMo1863b.getColumnCount() <= 0) {
                map = okw.f46216a;
                omn.m18709n(cursorMo1863b, null);
            } else {
                int columnIndex = cursorMo1863b.getColumnIndex("name");
                int columnIndex2 = cursorMo1863b.getColumnIndex("type");
                int columnIndex3 = cursorMo1863b.getColumnIndex("notnull");
                int columnIndex4 = cursorMo1863b.getColumnIndex("pk");
                int columnIndex5 = cursorMo1863b.getColumnIndex(KMNlNMe.TdGnG);
                olh olhVar = new olh();
                while (cursorMo1863b.moveToNext()) {
                    String string = cursorMo1863b.getString(columnIndex);
                    String string2 = cursorMo1863b.getString(columnIndex2);
                    boolean z = cursorMo1863b.getInt(columnIndex3) != 0;
                    int i = cursorMo1863b.getInt(columnIndex4);
                    String string3 = cursorMo1863b.getString(columnIndex5);
                    string.getClass();
                    string2.getClass();
                    olhVar.put(string, new aqe(string, string2, z, i, string3, 2));
                }
                olhVar.m18633k();
                omn.m18709n(cursorMo1863b, null);
                map = olhVar;
            }
            Cursor cursorMo1863b2 = aqpVar.mo1863b("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorMo1863b2.getColumnIndex("id");
                int columnIndex7 = cursorMo1863b2.getColumnIndex("seq");
                int columnIndex8 = cursorMo1863b2.getColumnIndex("table");
                int columnIndex9 = cursorMo1863b2.getColumnIndex("on_delete");
                int columnIndex10 = cursorMo1863b2.getColumnIndex("on_update");
                int columnIndex11 = cursorMo1863b2.getColumnIndex("id");
                int columnIndex12 = cursorMo1863b2.getColumnIndex("seq");
                int columnIndex13 = cursorMo1863b2.getColumnIndex("from");
                int columnIndex14 = cursorMo1863b2.getColumnIndex("to");
                List listM18665E = omn.m18665E();
                while (cursorMo1863b2.moveToNext()) {
                    String str4 = str3;
                    int i2 = cursorMo1863b2.getInt(columnIndex11);
                    int i3 = columnIndex11;
                    int i4 = cursorMo1863b2.getInt(columnIndex12);
                    int i5 = columnIndex12;
                    String string4 = cursorMo1863b2.getString(columnIndex13);
                    string4.getClass();
                    int i6 = columnIndex13;
                    String string5 = cursorMo1863b2.getString(columnIndex14);
                    string5.getClass();
                    listM18665E.add(new aqg(i2, i4, string4, string5));
                    map = map;
                    str3 = str4;
                    columnIndex11 = i3;
                    columnIndex12 = i5;
                    columnIndex13 = i6;
                }
                Map map2 = map;
                String str5 = str3;
                omn.m18681U(listM18665E);
                if (((olc) listM18665E).f46233c <= 1) {
                    listM18683W = omn.m18673M(listM18665E);
                } else {
                    Object[] array = listM18665E.toArray(new Comparable[0]);
                    Comparable[] comparableArr = (Comparable[]) array;
                    comparableArr.getClass();
                    if (comparableArr.length > 1) {
                        Arrays.sort(comparableArr);
                    }
                    listM18683W = omn.m18683W(array);
                }
                cursorMo1863b2.moveToPosition(-1);
                Set setM18717v = omn.m18717v();
                while (cursorMo1863b2.moveToNext()) {
                    if (cursorMo1863b2.getInt(columnIndex7) == 0) {
                        int i7 = cursorMo1863b2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<aqg> arrayList3 = new ArrayList();
                        for (Object obj : listM18683W) {
                            List list = listM18683W;
                            if (((aqg) obj).f2127a == i7) {
                                arrayList3.add(obj);
                            }
                            listM18683W = list;
                        }
                        List list2 = listM18683W;
                        for (aqg aqgVar : arrayList3) {
                            arrayList.add(aqgVar.f2128b);
                            arrayList2.add(aqgVar.f2129c);
                        }
                        String string6 = cursorMo1863b2.getString(columnIndex8);
                        string6.getClass();
                        String string7 = cursorMo1863b2.getString(columnIndex9);
                        string7.getClass();
                        String string8 = cursorMo1863b2.getString(columnIndex10);
                        string8.getClass();
                        setM18717v.add(new aqf(string6, string7, string8, arrayList, arrayList2));
                        listM18683W = list2;
                    }
                }
                omn.m18720y(setM18717v);
                omn.m18709n(cursorMo1863b2, null);
                Cursor cursorMo1863b3 = aqpVar.mo1863b("PRAGMA index_list(`" + str + "`)");
                String str6 = str5;
                try {
                    int columnIndex15 = cursorMo1863b3.getColumnIndex(str6);
                    int columnIndex16 = cursorMo1863b3.getColumnIndex("origin");
                    int columnIndex17 = cursorMo1863b3.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        omn.m18709n(cursorMo1863b3, null);
                        set = null;
                    } else {
                        Set setM18717v2 = omn.m18717v();
                        while (cursorMo1863b3.moveToNext()) {
                            if (ooc.m18737c("c", cursorMo1863b3.getString(columnIndex16))) {
                                String string9 = cursorMo1863b3.getString(columnIndex15);
                                boolean z2 = cursorMo1863b3.getInt(columnIndex17) == 1;
                                string9.getClass();
                                Cursor cursorMo1863b4 = aqpVar.mo1863b("PRAGMA index_xinfo(`" + string9 + str2);
                                try {
                                    int columnIndex18 = cursorMo1863b4.getColumnIndex("seqno");
                                    int columnIndex19 = cursorMo1863b4.getColumnIndex(EArqVBjecl.HfjCOkTe);
                                    int columnIndex20 = cursorMo1863b4.getColumnIndex(str6);
                                    int columnIndex21 = cursorMo1863b4.getColumnIndex("desc");
                                    String str7 = str6;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        th = null;
                                        omn.m18709n(cursorMo1863b4, null);
                                        aqhVar = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        columnIndex15 = columnIndex15;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (cursorMo1863b4.moveToNext()) {
                                            if (cursorMo1863b4.getInt(columnIndex19) >= 0) {
                                                int i8 = cursorMo1863b4.getInt(columnIndex18);
                                                String str8 = str2;
                                                String string10 = cursorMo1863b4.getString(columnIndex20);
                                                Object obj2 = cursorMo1863b4.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i9 = columnIndex16;
                                                Integer numValueOf = Integer.valueOf(i8);
                                                string10.getClass();
                                                treeMap.put(numValueOf, string10);
                                                treeMap2.put(numValueOf, obj2);
                                                str2 = str8;
                                                columnIndex16 = i9;
                                                columnIndex21 = columnIndex21;
                                            }
                                        }
                                        str2 = str2;
                                        columnIndex16 = columnIndex16;
                                        Collection collectionValues = treeMap.values();
                                        collectionValues.getClass();
                                        List listM18673M = omn.m18673M(collectionValues);
                                        Collection collectionValues2 = treeMap2.values();
                                        collectionValues2.getClass();
                                        aqhVar = new aqh(string9, z2, listM18673M, omn.m18673M(collectionValues2));
                                        omn.m18709n(cursorMo1863b4, null);
                                        th = null;
                                    }
                                    if (aqhVar == null) {
                                        omn.m18709n(cursorMo1863b3, th);
                                        set = null;
                                    } else {
                                        setM18717v2.add(aqhVar);
                                        str6 = str7;
                                        columnIndex15 = columnIndex15;
                                        str2 = str2;
                                        columnIndex16 = columnIndex16;
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        omn.m18709n(cursorMo1863b4, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                        omn.m18720y(setM18717v2);
                        omn.m18709n(cursorMo1863b3, null);
                        set = setM18717v2;
                    }
                    return new aqi(str, map2, setM18717v, set);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        omn.m18709n(cursorMo1863b3, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    omn.m18709n(cursorMo1863b2, th6);
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                omn.m18709n(cursorMo1863b, th8);
                throw th9;
            }
        }
    }
}
