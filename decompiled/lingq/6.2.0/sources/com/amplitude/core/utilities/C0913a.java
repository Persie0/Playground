package com.amplitude.core.utilities;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC3550rv;
import p000.AbstractC3584sr;
import p000.C3336mi;
import p000.C3386nv;
import p000.b34;
import p000.b64;
import p000.bq1;
import p000.c76;
import p000.cl9;
import p000.mu2;
import p000.omd;
import p000.pj5;
import p000.u91;
import p000.ux5;
import p000.v33;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.yu0;

/* JADX INFO: renamed from: com.amplitude.core.utilities.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0913a {

    /* JADX INFO: renamed from: l */
    public static final ConcurrentHashMap f11249l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f11250m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final File f11251a;

    /* JADX INFO: renamed from: b */
    public final String f11252b;

    /* JADX INFO: renamed from: c */
    public final C3336mi f11253c;

    /* JADX INFO: renamed from: d */
    public final pj5 f11254d;

    /* JADX INFO: renamed from: e */
    public final b64 f11255e;

    /* JADX INFO: renamed from: f */
    public final String f11256f;

    /* JADX INFO: renamed from: g */
    public final String f11257g;

    /* JADX INFO: renamed from: h */
    public final Set f11258h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f11259i;

    /* JADX INFO: renamed from: j */
    public final c76 f11260j;

    /* JADX INFO: renamed from: k */
    public final c76 f11261k;

    public C0913a(File file, String str, C3336mi c3336mi, pj5 pj5Var, b64 b64Var) {
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        str.getClass();
        pj5Var.getClass();
        b64Var.getClass();
        this.f11251a = file;
        this.f11252b = str;
        this.f11253c = c3336mi;
        this.f11254d = pj5Var;
        this.f11255e = b64Var;
        this.f11256f = "amplitude.events.file.index.".concat(str);
        this.f11257g = "amplitude.events.file.version.".concat(str);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.f11258h = setNewSetFromMap;
        this.f11259i = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = f11249l;
        Object c3248a = concurrentHashMap.get(str);
        if (c3248a == null && (objPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, (c3248a = new C3248a()))) != null) {
            c3248a = objPutIfAbsent2;
        }
        this.f11260j = (c76) c3248a;
        ConcurrentHashMap concurrentHashMap2 = f11250m;
        Object c3248a2 = concurrentHashMap2.get(str);
        if (c3248a2 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (c3248a2 = new C3248a()))) != null) {
            c3248a2 = objPutIfAbsent;
        }
        this.f11261k = (c76) c3248a2;
        m5158f();
        wfb.m23899A(new EventsFileManager$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m5153a(C0913a c0913a, ContinuationImpl continuationImpl) throws Throwable {
        EventsFileManager$handleV1Files$1 eventsFileManager$handleV1Files$1;
        c76 c76Var;
        if (continuationImpl instanceof EventsFileManager$handleV1Files$1) {
            eventsFileManager$handleV1Files$1 = (EventsFileManager$handleV1Files$1) continuationImpl;
            int i = eventsFileManager$handleV1Files$1.f11201e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$handleV1Files$1.f11201e = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$handleV1Files$1 = new EventsFileManager$handleV1Files$1(c0913a, continuationImpl);
            }
        } else {
            eventsFileManager$handleV1Files$1 = new EventsFileManager$handleV1Files$1(c0913a, continuationImpl);
        }
        Object obj = eventsFileManager$handleV1Files$1.f11199c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eventsFileManager$handleV1Files$1.f11201e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c76Var = c0913a.f11260j;
            c76Var.getClass();
            eventsFileManager$handleV1Files$1.f11197a = c0913a;
            eventsFileManager$handleV1Files$1.f11198b = c76Var;
            eventsFileManager$handleV1Files$1.f11201e = 1;
            if (c76Var.mo4388c(eventsFileManager$handleV1Files$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c76 c76Var2 = eventsFileManager$handleV1Files$1.f11198b;
            C0913a c0913a2 = eventsFileManager$handleV1Files$1.f11197a;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var2;
            c0913a = c0913a2;
        }
        try {
            if (c0913a.f11253c.m16839b(c0913a.f11257g, 1L) <= 1) {
                File[] fileArrListFiles = c0913a.f11251a.listFiles(new mu2(c0913a, 2));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                ArrayList<File> arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.exists()) {
                        arrayList.add(file);
                    }
                }
                for (File file2 : arrayList) {
                    file2.getClass();
                    Charset charset = yu0.f70463a;
                    charset.getClass();
                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
                    try {
                        String strM4066s0 = bq1.m4066s0(inputStreamReader);
                        inputStreamReader.close();
                        if (!cl9.m4833P(strM4066s0, "\u0000", false)) {
                            String str = '[' + vk9.m23378N0(vk9.m23379O0(strM4066s0, '[', ','), ']', ',') + ']';
                            try {
                                c0913a.m5165m(b34.m3228Y(new JSONArray(str)), file2, false);
                                if (v33.m23078T(file2).equals("tmp")) {
                                    c0913a.m5156d(file2);
                                }
                            } catch (JSONException e) {
                                c0913a.f11254d.mo16255a("Failed to parse events: " + str + ", dropping file: " + file2.getPath() + ", error: " + e);
                                String path = file2.getPath();
                                path.getClass();
                                c0913a.m5160h(path);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3584sr.m21646y(inputStreamReader, th);
                            throw th2;
                        }
                    }
                }
                c0913a.f11253c.m16840c(c0913a.f11257g, 2L);
            }
            xfa xfaVar = xfa.f68157a;
            c76Var.mo4387b(null);
            return xfaVar;
        } catch (Throwable th3) {
            c76Var.mo4387b(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5154b(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return true;
        } catch (IOException e) {
            this.f11255e.m3350c("Failed to create new storage file: " + e.getMessage());
            this.f11254d.mo16255a("Failed to create new storage file: " + file.getPath());
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m5155c() {
        ConcurrentHashMap concurrentHashMap = this.f11259i;
        String str = this.f11252b;
        File file = (File) concurrentHashMap.get(str);
        File file2 = this.f11251a;
        if (file == null) {
            File[] fileArrListFiles = file2.listFiles(new mu2(this, 1));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            file = (File) AbstractC3550rv.m20842j0(fileArrListFiles, 0);
        }
        long jM16839b = this.f11253c.m16839b(this.f11256f, 0L);
        if (file == null) {
            file = new File(file2, str + '-' + jM16839b + ".tmp");
        }
        concurrentHashMap.put(str, file);
        Object obj = concurrentHashMap.get(str);
        obj.getClass();
        return (File) obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m5156d(File file) {
        m5161i(file);
        C3336mi c3336mi = this.f11253c;
        String str = this.f11256f;
        c3336mi.m16840c(str, c3336mi.m16839b(str, 0L) + 1);
        this.f11259i.remove(this.f11252b);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:27:0x0084, B:28:0x0092, B:32:0x009c, B:34:0x00a0, B:36:0x00a6, B:41:0x00b8, B:40:0x00b5, B:42:0x00bb, B:44:0x00c1, B:46:0x00c7, B:47:0x00cd, B:48:0x00d0, B:50:0x00d6, B:51:0x00da), top: B:61:0x0084, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m5157e(String str, ContinuationImpl continuationImpl) throws Throwable {
        EventsFileManager$getEventString$1 eventsFileManager$getEventString$1;
        c76 c76Var;
        if (continuationImpl instanceof EventsFileManager$getEventString$1) {
            eventsFileManager$getEventString$1 = (EventsFileManager$getEventString$1) continuationImpl;
            int i = eventsFileManager$getEventString$1.f11196f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$getEventString$1.f11196f = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$getEventString$1 = new EventsFileManager$getEventString$1(this, continuationImpl);
            }
        } else {
            eventsFileManager$getEventString$1 = new EventsFileManager$getEventString$1(this, continuationImpl);
        }
        Object obj = eventsFileManager$getEventString$1.f11194d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eventsFileManager$getEventString$1.f11196f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c76Var = this.f11261k;
            c76Var.getClass();
            eventsFileManager$getEventString$1.f11191a = this;
            eventsFileManager$getEventString$1.f11192b = str;
            eventsFileManager$getEventString$1.f11193c = c76Var;
            eventsFileManager$getEventString$1.f11196f = 1;
            if (c76Var.mo4388c(eventsFileManager$getEventString$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c76 c76Var2 = eventsFileManager$getEventString$1.f11193c;
            str = eventsFileManager$getEventString$1.f11192b;
            C0913a c0913a = eventsFileManager$getEventString$1.f11191a;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var2;
            this = c0913a;
        }
        try {
            boolean zContains = this.f11258h.contains(str);
            Set set = this.f11258h;
            String string = "";
            if (zContains) {
                set.remove(str);
            } else {
                set.add(str);
                File file = new File(str);
                if (file.exists()) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), yu0.f70463a), 8192);
                    try {
                        JSONArray jSONArray = new JSONArray();
                        StringBuilder sb = new StringBuilder();
                        char[] cArr = new char[8192];
                        boolean z = false;
                        while (true) {
                            int i3 = bufferedReader.read(cArr);
                            if (i3 == -1) {
                                break;
                            }
                            for (int i4 = 0; i4 < i3; i4++) {
                                char c = cArr[i4];
                                if (c == 0) {
                                    if (sb.length() > 0) {
                                        this.m5164l(sb.toString(), jSONArray);
                                        sb.setLength(0);
                                    }
                                    z = true;
                                } else {
                                    sb.append(c);
                                }
                            }
                        }
                        if (sb.length() > 0) {
                            String string2 = sb.toString();
                            if (z) {
                                this.m5164l(string2, jSONArray);
                                string = jSONArray.length() > 0 ? jSONArray.toString() : "";
                                string.getClass();
                            } else {
                                string = this.m5159g(string2, str);
                            }
                        } else {
                            if (jSONArray.length() > 0) {
                            }
                            string.getClass();
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3584sr.m21646y(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
            }
            c76Var.mo4387b(null);
            return string;
        } catch (Throwable th3) {
            c76Var.mo4387b(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5158f() {
        File file = this.f11251a;
        try {
            omd.m18164t(file);
            return true;
        } catch (IOException e) {
            this.f11255e.m3350c("Failed to create directory: " + e.getMessage());
            this.f11254d.mo16255a("Failed to create directory for events storage: " + file.getPath());
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m5159g(String str, String str2) {
        String str3 = "[" + vk9.m23378N0(vk9.m23379O0(str, '[', ','), ']', ',') + ']';
        try {
            String string = new JSONArray(str3).toString();
            string.getClass();
            return string;
        } catch (JSONException e) {
            b64 b64Var = this.f11255e;
            if (((List) b64Var.f8006a) == null) {
                b64Var.f8006a = Collections.synchronizedList(new ArrayList());
            }
            List list = (List) b64Var.f8006a;
            if (list != null) {
                list.add(str3);
            }
            StringBuilder sbM23000w = ux5.m23000w("Failed to parse events: ", str3, ", dropping file: ", str2, ", error: ");
            sbM23000w.append(e);
            this.f11254d.mo16255a(sbM23000w.toString());
            m5160h(str2);
            return str3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5160h(String str) {
        str.getClass();
        this.f11258h.remove(str);
        return new File(str).delete();
    }

    /* JADX INFO: renamed from: i */
    public final void m5161i(File file) {
        if (!file.exists() || v33.m23078T(file).length() == 0) {
            return;
        }
        String strM23079U = v33.m23079U(file);
        File file2 = this.f11251a;
        File file3 = new File(file2, strM23079U);
        if (!file3.exists()) {
            file.renameTo(new File(file2, v33.m23079U(file)));
            return;
        }
        this.f11254d.mo16256b("File already exists: " + file3 + ", handle gracefully.");
        file.renameTo(new File(file2, strM23079U + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(DescriptorProtos.Edition.EDITION_2023_VALUE)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m5162j(ContinuationImpl continuationImpl) {
        EventsFileManager$rollover$1 eventsFileManager$rollover$1;
        c76 c76Var;
        if (continuationImpl instanceof EventsFileManager$rollover$1) {
            eventsFileManager$rollover$1 = (EventsFileManager$rollover$1) continuationImpl;
            int i = eventsFileManager$rollover$1.f11206e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$rollover$1.f11206e = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$rollover$1 = new EventsFileManager$rollover$1(this, continuationImpl);
            }
        } else {
            eventsFileManager$rollover$1 = new EventsFileManager$rollover$1(this, continuationImpl);
        }
        Object obj = eventsFileManager$rollover$1.f11204c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eventsFileManager$rollover$1.f11206e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c76Var = this.f11260j;
            c76Var.getClass();
            eventsFileManager$rollover$1.f11202a = this;
            eventsFileManager$rollover$1.f11203b = c76Var;
            eventsFileManager$rollover$1.f11206e = 1;
            if (c76Var.mo4388c(eventsFileManager$rollover$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c76 c76Var2 = eventsFileManager$rollover$1.f11203b;
            C0913a c0913a = eventsFileManager$rollover$1.f11202a;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var2;
            this = c0913a;
        }
        try {
            File fileM5155c = this.m5155c();
            if (fileM5155c.exists() && fileM5155c.length() > 0) {
                this.m5156d(fileM5155c);
            }
            return xfa.f68157a;
        } finally {
            c76Var.mo4387b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m5163k(String str, ContinuationImpl continuationImpl) throws Throwable {
        EventsFileManager$storeEvent$1 eventsFileManager$storeEvent$1;
        c76 c76Var;
        if (continuationImpl instanceof EventsFileManager$storeEvent$1) {
            eventsFileManager$storeEvent$1 = (EventsFileManager$storeEvent$1) continuationImpl;
            int i = eventsFileManager$storeEvent$1.f11212f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$storeEvent$1.f11212f = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$storeEvent$1 = new EventsFileManager$storeEvent$1(this, continuationImpl);
            }
        } else {
            eventsFileManager$storeEvent$1 = new EventsFileManager$storeEvent$1(this, continuationImpl);
        }
        Object obj = eventsFileManager$storeEvent$1.f11210d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eventsFileManager$storeEvent$1.f11212f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c76Var = this.f11260j;
            c76Var.getClass();
            eventsFileManager$storeEvent$1.f11207a = this;
            eventsFileManager$storeEvent$1.f11208b = str;
            eventsFileManager$storeEvent$1.f11209c = c76Var;
            eventsFileManager$storeEvent$1.f11212f = 1;
            if (c76Var.mo4388c(eventsFileManager$storeEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c76 c76Var2 = eventsFileManager$storeEvent$1.f11209c;
            str = eventsFileManager$storeEvent$1.f11208b;
            C0913a c0913a = eventsFileManager$storeEvent$1.f11207a;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var2;
            this = c0913a;
        }
        try {
            if (this.m5158f()) {
                File fileM5155c = this.m5155c();
                if (this.m5154b(fileM5155c)) {
                    do {
                        if (fileM5155c.length() <= 975000) {
                            byte[] bytes = (cl9.m4839V(str, "\u0000", "") + (char) 0).getBytes(yu0.f70463a);
                            bytes.getClass();
                            this.m5166n(bytes, fileM5155c, true);
                            break;
                        }
                        this.m5156d(fileM5155c);
                        fileM5155c = this.m5155c();
                    } while (this.m5154b(fileM5155c));
                }
            }
            return xfa.f68157a;
        } finally {
            c76Var.mo4387b(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5164l(String str, JSONArray jSONArray) {
        try {
            jSONArray.put(new JSONObject(str));
        } catch (JSONException e) {
            b64 b64Var = this.f11255e;
            if (((List) b64Var.f8006a) == null) {
                b64Var.f8006a = Collections.synchronizedList(new ArrayList());
            }
            List list = (List) b64Var.f8006a;
            if (list != null) {
                list.add(str);
            }
            this.f11254d.mo16255a("Failed to parse event: " + str + ", error: " + e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5165m(List list, File file, boolean z) {
        pj5 pj5Var = this.f11254d;
        b64 b64Var = this.f11255e;
        try {
            String strM22596N0 = u91.m22596N0(list, "\u0000", null, "\u0000", EventsFileManager$writeEventsToSplitFile$contents$1.f11213b, 26);
            file.createNewFile();
            byte[] bytes = strM22596N0.getBytes(yu0.f70463a);
            bytes.getClass();
            m5166n(bytes, file, z);
            m5161i(file);
        } catch (IOException e) {
            b64Var.m3350c("Failed to create or write to split file: " + e.getMessage());
            pj5Var.mo16255a("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e2) {
            b64Var.m3350c("Failed to write to split file: " + e2.getMessage());
            pj5Var.mo16255a("Failed to write to split file: " + file.getPath() + " for error: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5166n(byte[] bArr, File file, boolean z) {
        pj5 pj5Var = this.f11254d;
        b64 b64Var = this.f11255e;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            b64Var.m3350c("Error writing to file: " + e.getMessage());
            pj5Var.mo16255a("File not found: " + file.getPath());
        } catch (IOException e2) {
            b64Var.m3350c("Error writing to file: " + e2.getMessage());
            pj5Var.mo16255a("Failed to write to file: " + file.getPath());
        } catch (SecurityException e3) {
            b64Var.m3350c("Error writing to file: " + e3.getMessage());
            pj5Var.mo16255a("Security exception when saving event: " + e3.getMessage());
        } catch (Exception e4) {
            b64Var.m3350c("Error writing to file: " + e4.getMessage());
            pj5Var.mo16255a("Failed to write to file: " + file.getPath());
        }
    }
}
