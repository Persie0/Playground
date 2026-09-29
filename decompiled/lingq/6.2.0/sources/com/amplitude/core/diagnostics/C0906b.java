package com.amplitude.core.diagnostics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.channels.C3211a;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC3584sr;
import p000.abd;
import p000.bq1;
import p000.ci8;
import p000.cl9;
import p000.dfd;
import p000.dha;
import p000.do7;
import p000.ma3;
import p000.md2;
import p000.nn1;
import p000.od2;
import p000.pj5;
import p000.un1;
import p000.v33;
import p000.vk9;
import p000.wfb;
import p000.xt3;
import p000.yu0;

/* JADX INFO: renamed from: com.amplitude.core.diagnostics.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0906b {

    /* JADX INFO: renamed from: a */
    public final File f11070a;

    /* JADX INFO: renamed from: b */
    public final String f11071b;

    /* JADX INFO: renamed from: c */
    public final pj5 f11072c;

    /* JADX INFO: renamed from: d */
    public final un1 f11073d;

    /* JADX INFO: renamed from: e */
    public final nn1 f11074e;

    /* JADX INFO: renamed from: f */
    public final String f11075f;

    /* JADX INFO: renamed from: g */
    public final C3211a f11076g;

    public C0906b(File file, String str, String str2, pj5 pj5Var, un1 un1Var, nn1 nn1Var) {
        str.getClass();
        str2.getClass();
        pj5Var.getClass();
        this.f11070a = file;
        this.f11071b = str2;
        this.f11072c = pj5Var;
        this.f11073d = un1Var;
        this.f11074e = nn1Var;
        byte[] bytes = str.getBytes(yu0.f70463a);
        bytes.getClass();
        long j = -3750763034362895579L;
        for (byte b : bytes) {
            j = (j ^ (((long) b) & 255)) * 1099511628211L;
        }
        ci8.m4727l(16);
        this.f11075f = vk9.m23396s0(16, dha.m10393e(16, j));
        this.f11076g = do7.m10525a(8192, 6, null);
        wfb.m23926u(this.f11073d, this.f11074e, null, new DiagnosticsStorage$actorJob$1(this, null), 2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m5126a(C0906b c0906b, od2 od2Var, File file) throws JSONException {
        pj5 pj5Var = c0906b.f11072c;
        Map map = od2Var.f54199a;
        if (map != null) {
            try {
                c0906b.m5134h(map, file);
            } catch (IOException e) {
                pj5Var.mo16255a("DiagnosticsStorage: Failed to write tags: " + e.getMessage());
            }
        }
        Map map2 = od2Var.f54200b;
        if (map2 != null) {
            try {
                c0906b.m5131e(map2, file);
            } catch (IOException e2) {
                pj5Var.mo16255a("DiagnosticsStorage: Failed to write counters: " + e2.getMessage());
            }
        }
        Map map3 = od2Var.f54201c;
        if (map3 != null) {
            try {
                c0906b.m5133g(map3, file);
            } catch (IOException e3) {
                pj5Var.mo16255a("DiagnosticsStorage: Failed to write histograms: " + e3.getMessage());
            }
        }
        List list = od2Var.f54202d;
        if (list != null) {
            try {
                c0906b.m5132f(list, file);
            } catch (IOException e4) {
                pj5Var.mo16255a("DiagnosticsStorage: Failed to write events: " + e4.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5127b(C0906b c0906b) {
        File file = new File(new File(new File(c0906b.f11070a, "com.amplitude.diagnostics"), c0906b.f11075f), c0906b.f11071b);
        if (file.exists()) {
            new File(file, "counters.json").delete();
            new File(file, "counters.json.tmp").delete();
            new File(file, "histograms.json").delete();
            new File(file, "histograms.json.tmp").delete();
            new File(file, "events.log").delete();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    name.getClass();
                    if (cl9.m4842Y(name, "events-", false) && cl9.m4833P(name, ".log", false)) {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5128c(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m5128c(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: i */
    public static JSONObject m5129i(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, yu0.f70463a));
            try {
                JSONObject jSONObject = new JSONObject(bq1.m4066s0(bufferedReader));
                bufferedReader.close();
                fileInputStream.close();
                return jSONObject;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(fileInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: d */
    public final od2 m5130d(File file) {
        Map mapM15360M;
        Map mapM15360M2;
        Map mapM15360M3;
        List<File> listAsList;
        ?? arrayList;
        File file2 = new File(file, "tags.json");
        boolean zExists = file2.exists();
        pj5 pj5Var = this.f11072c;
        if (zExists) {
            try {
                JSONObject jSONObjectM5129i = m5129i(file2);
                MapBuilder mapBuilder = new MapBuilder();
                Iterator<String> itKeys = jSONObjectM5129i.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    String string = jSONObjectM5129i.getString(next);
                    string.getClass();
                    mapBuilder.put(next, string);
                }
                mapM15360M = mapBuilder.m15392b();
            } catch (Exception e) {
                pj5Var.mo16255a("DiagnosticsStorage: Failed to load tags: " + e.getMessage());
                mapM15360M = AbstractC3194a.m15360M();
            }
        } else {
            mapM15360M = AbstractC3194a.m15360M();
        }
        File file3 = new File(file, "counters.json");
        if (file3.exists()) {
            try {
                JSONObject jSONObjectM5129i2 = m5129i(file3);
                MapBuilder mapBuilder2 = new MapBuilder();
                Iterator<String> itKeys2 = jSONObjectM5129i2.keys();
                itKeys2.getClass();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    next2.getClass();
                    mapBuilder2.put(next2, Long.valueOf(jSONObjectM5129i2.getLong(next2)));
                }
                mapM15360M2 = mapBuilder2.m15392b();
            } catch (Exception e2) {
                pj5Var.mo16255a("DiagnosticsStorage: Failed to load counters: " + e2.getMessage());
                mapM15360M2 = AbstractC3194a.m15360M();
            }
        } else {
            mapM15360M2 = AbstractC3194a.m15360M();
        }
        File file4 = new File(file, "histograms.json");
        if (file4.exists()) {
            try {
                JSONObject jSONObjectM5129i3 = m5129i(file4);
                MapBuilder mapBuilder3 = new MapBuilder();
                Iterator<String> itKeys3 = jSONObjectM5129i3.keys();
                itKeys3.getClass();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    next3.getClass();
                    JSONObject jSONObject = jSONObjectM5129i3.getJSONObject(next3);
                    jSONObject.getClass();
                    mapBuilder3.put(next3, dfd.m10324a(jSONObject));
                }
                mapM15360M3 = mapBuilder3.m15392b();
            } catch (Exception e3) {
                pj5Var.mo16255a("DiagnosticsStorage: Failed to load histograms: " + e3.getMessage());
                mapM15360M3 = AbstractC3194a.m15360M();
            }
        } else {
            mapM15360M3 = AbstractC3194a.m15360M();
        }
        boolean zExists2 = file.exists();
        List list = EmptyList.f47638a;
        if (zExists2 && file.isDirectory()) {
            Object[] objArrListFiles = file.listFiles(new FileFilter() { // from class: qd2
                @Override // java.io.FileFilter
                public final boolean accept(File file5) {
                    if (file5.isFile()) {
                        if (fa4.m11650l(file5.getName(), "events.log")) {
                            return true;
                        }
                        String name = file5.getName();
                        name.getClass();
                        if (cl9.m4842Y(name, "events-", false)) {
                            String name2 = file5.getName();
                            name2.getClass();
                            if (cl9.m4833P(name2, ".log", false)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            });
            if (objArrListFiles != null) {
                ma3 ma3Var = new ma3(13);
                if (objArrListFiles.length != 0) {
                    objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                    if (objArrListFiles.length > 1) {
                        Arrays.sort(objArrListFiles, ma3Var);
                    }
                }
                listAsList = Arrays.asList(objArrListFiles);
                listAsList.getClass();
            } else {
                listAsList = list;
            }
            if (!listAsList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (File file5 : listAsList) {
                    file5.getClass();
                    if (file5.exists()) {
                        try {
                            arrayList = new ArrayList();
                            FileInputStream fileInputStream = new FileInputStream(file5);
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, yu0.f70463a));
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        if (!vk9.m23391n0(line)) {
                                            try {
                                                md2 md2VarM247c = abd.m247c(line);
                                                if (md2VarM247c != null) {
                                                    arrayList.add(md2VarM247c);
                                                } else {
                                                    pj5Var.mo16255a("DiagnosticsStorage: Skipping invalid event payload");
                                                }
                                            } catch (JSONException e4) {
                                                pj5Var.mo16255a("DiagnosticsStorage: Failed to parse event: " + e4.getMessage());
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC3584sr.m21646y(bufferedReader, th);
                                            throw th2;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        AbstractC3584sr.m21646y(fileInputStream, th);
                                        throw th3;
                                    }
                                }
                                bufferedReader.close();
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        } catch (Exception e5) {
                            pj5Var.mo16255a("DiagnosticsStorage: Failed to load events: " + e5.getMessage());
                        }
                    } else {
                        arrayList = list;
                    }
                    arrayList2.addAll((Collection) arrayList);
                }
                list = arrayList2;
            }
        }
        if (mapM15360M2.isEmpty() && mapM15360M3.isEmpty() && list.isEmpty()) {
            return null;
        }
        return new od2(mapM15360M, mapM15360M2, mapM15360M3, list);
    }

    /* JADX INFO: renamed from: e */
    public final void m5131e(Map map, File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        m5135j(new File(file, "counters.json"), jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m5132f(List list, File file) throws IOException {
        File file2 = new File(file, "events.log");
        if (!file2.exists()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file2.createNewFile();
        } else if (file2.length() >= 262144) {
            if (file2.renameTo(new File(file, "events-" + System.currentTimeMillis() + ".log"))) {
                file2.createNewFile();
            } else {
                this.f11072c.mo16257c("DiagnosticsStorage: Failed to rotate events log");
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, yu0.f70463a));
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write(((md2) it.next()).m16782b());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(bufferedWriter, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(fileOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5133g(Map map, File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), ((xt3) entry.getValue()).m24672a());
        }
        m5135j(new File(file, "histograms.json"), jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public final void m5134h(Map map, File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        m5135j(new File(file, "tags.json"), jSONObject);
    }

    /* JADX INFO: renamed from: j */
    public final void m5135j(File file, JSONObject jSONObject) {
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, yu0.f70463a));
                    try {
                        bufferedWriter.write(jSONObject.toString());
                        bufferedWriter.close();
                        fileOutputStream.close();
                        if (!file2.renameTo(file)) {
                            v33.m23077S(file2, file);
                        }
                        file2.delete();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3584sr.m21646y(bufferedWriter, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC3584sr.m21646y(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e) {
                this.f11072c.mo16255a("DiagnosticsStorage: Failed to write JSON to file: " + file.getAbsolutePath() + ": " + e.getMessage());
                throw e;
            }
        } catch (Throwable th5) {
            file2.delete();
            throw th5;
        }
    }
}
