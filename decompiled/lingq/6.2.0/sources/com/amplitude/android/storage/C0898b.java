package com.amplitude.android.storage;

import android.content.SharedPreferences;
import com.amplitude.core.Storage$Constants;
import com.amplitude.core.utilities.C0913a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3336mi;
import p000.C3386nv;
import p000.b64;
import p000.b90;
import p000.d32;
import p000.ld2;
import p000.mu2;
import p000.nu2;
import p000.ny8;
import p000.pj5;
import p000.r8d;
import p000.sc2;
import p000.v91;
import p000.vz1;
import p000.wi1;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.storage.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0898b {

    /* JADX INFO: renamed from: a */
    public final pj5 f10989a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f10990b;

    /* JADX INFO: renamed from: c */
    public final ld2 f10991c;

    /* JADX INFO: renamed from: d */
    public final C0913a f10992d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f10993e;

    public C0898b(String str, pj5 pj5Var, SharedPreferences sharedPreferences, File file, b64 b64Var, ld2 ld2Var) {
        str.getClass();
        pj5Var.getClass();
        b64Var.getClass();
        this.f10989a = pj5Var;
        this.f10990b = sharedPreferences;
        this.f10991c = ld2Var;
        this.f10992d = new C0913a(file, str, new C3336mi(sharedPreferences), pj5Var, b64Var);
        this.f10993e = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final String m5096a(Storage$Constants storage$Constants) {
        storage$Constants.getClass();
        return this.f10990b.getString(storage$Constants.getRawVal(), null);
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m5097b() {
        C0913a c0913a = this.f10992d;
        int i = 0;
        Object[] objArrListFiles = c0913a.f11251a.listFiles(new mu2(c0913a, i));
        if (objArrListFiles == null) {
            objArrListFiles = new File[0];
        }
        nu2 nu2Var = new nu2(c0913a, i);
        if (objArrListFiles.length != 0) {
            objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
            if (objArrListFiles.length > 1) {
                Arrays.sort(objArrListFiles, nu2Var);
            }
        }
        List listAsList = Arrays.asList(objArrListFiles);
        listAsList.getClass();
        List list = listAsList;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m5098c(String str) {
        str.getClass();
        C0913a c0913a = this.f10992d;
        c0913a.getClass();
        c0913a.f11258h.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m5099d(Storage$Constants storage$Constants) {
        SharedPreferences.Editor editorEdit = this.f10990b.edit();
        editorEdit.remove(storage$Constants.getRawVal());
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5100e(String str) {
        str.getClass();
        return this.f10992d.m5160h(str);
    }

    /* JADX INFO: renamed from: f */
    public final Object m5101f(ContinuationImpl continuationImpl) {
        Object objM5162j = this.f10992d.m5162j(continuationImpl);
        return objM5162j == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5162j : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final void m5102g(Storage$Constants storage$Constants, String str) {
        SharedPreferences.Editor editorEdit = this.f10990b.edit();
        editorEdit.putString(storage$Constants.getRawVal(), str);
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m5103h(b90 b90Var, ContinuationImpl continuationImpl) throws Throwable {
        AndroidStorageV2$writeEvent$1 androidStorageV2$writeEvent$1;
        if (continuationImpl instanceof AndroidStorageV2$writeEvent$1) {
            androidStorageV2$writeEvent$1 = (AndroidStorageV2$writeEvent$1) continuationImpl;
            int i = androidStorageV2$writeEvent$1.f10981e;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageV2$writeEvent$1.f10981e = i - Integer.MIN_VALUE;
            } else {
                androidStorageV2$writeEvent$1 = new AndroidStorageV2$writeEvent$1(this, continuationImpl);
            }
        } else {
            androidStorageV2$writeEvent$1 = new AndroidStorageV2$writeEvent$1(this, continuationImpl);
        }
        Object obj = androidStorageV2$writeEvent$1.f10979c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidStorageV2$writeEvent$1.f10981e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            b90Var.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", b90Var.mo3490a());
            String str = b90Var.f8142a;
            if (str != null) {
                jSONObject.put("user_id", str);
            }
            String str2 = b90Var.f8143b;
            if (str2 != null) {
                jSONObject.put("device_id", str2);
            }
            Long l = b90Var.f8144c;
            if (l != null) {
                jSONObject.put("time", l);
            }
            jSONObject.put("event_properties", d32.m10050l0(vz1.m23632g0(b90Var.f8138M)));
            jSONObject.put("user_properties", d32.m10050l0(vz1.m23632g0(b90Var.f8139N)));
            jSONObject.put("groups", d32.m10050l0(vz1.m23632g0(b90Var.f8140O)));
            jSONObject.put("group_properties", d32.m10050l0(vz1.m23632g0(b90Var.f8141P)));
            String str3 = b90Var.f8150i;
            if (str3 != null) {
                jSONObject.put("app_version", str3);
            }
            String str4 = b90Var.f8152k;
            if (str4 != null) {
                jSONObject.put("platform", str4);
            }
            String str5 = b90Var.f8153l;
            if (str5 != null) {
                jSONObject.put("os_name", str5);
            }
            String str6 = b90Var.f8154m;
            if (str6 != null) {
                jSONObject.put("os_version", str6);
            }
            String str7 = b90Var.f8155n;
            if (str7 != null) {
                jSONObject.put("device_brand", str7);
            }
            String str8 = b90Var.f8156o;
            if (str8 != null) {
                jSONObject.put("device_manufacturer", str8);
            }
            String str9 = b90Var.f8157p;
            if (str9 != null) {
                jSONObject.put("device_model", str9);
            }
            String str10 = b90Var.f8158q;
            if (str10 != null) {
                jSONObject.put("carrier", str10);
            }
            String str11 = b90Var.f8159r;
            if (str11 != null) {
                jSONObject.put("country", str11);
            }
            String str12 = b90Var.f8160s;
            if (str12 != null) {
                jSONObject.put("region", str12);
            }
            String str13 = b90Var.f8161t;
            if (str13 != null) {
                jSONObject.put("city", str13);
            }
            String str14 = b90Var.f8162u;
            if (str14 != null) {
                jSONObject.put("dma", str14);
            }
            String str15 = b90Var.f8126A;
            if (str15 != null) {
                jSONObject.put("language", str15);
            }
            Double d = b90Var.f8132G;
            if (d != null) {
                jSONObject.put("price", d);
            }
            Integer num = b90Var.f8133H;
            if (num != null) {
                jSONObject.put("quantity", num);
            }
            Double d2 = b90Var.f8131F;
            if (d2 != null) {
                jSONObject.put("revenue", d2);
            }
            String str16 = b90Var.f8134I;
            if (str16 != null) {
                jSONObject.put("productId", str16);
            }
            String str17 = b90Var.f8135J;
            if (str17 != null) {
                jSONObject.put("revenueType", str17);
            }
            Double d3 = b90Var.f8148g;
            if (d3 != null) {
                jSONObject.put("location_lat", d3);
            }
            Double d4 = b90Var.f8149h;
            if (d4 != null) {
                jSONObject.put("location_lng", d4);
            }
            String str18 = b90Var.f8128C;
            if (str18 != null) {
                jSONObject.put("ip", str18);
            }
            String str19 = b90Var.f8151j;
            if (str19 != null) {
                jSONObject.put("version_name", str19);
            }
            String str20 = b90Var.f8163v;
            if (str20 != null) {
                jSONObject.put("idfa", str20);
            }
            String str21 = b90Var.f8164w;
            if (str21 != null) {
                jSONObject.put("idfv", str21);
            }
            String str22 = b90Var.f8165x;
            if (str22 != null) {
                jSONObject.put("adid", str22);
            }
            String str23 = b90Var.f8167z;
            if (str23 != null) {
                jSONObject.put("android_id", str23);
            }
            Long l2 = b90Var.f8145d;
            if (l2 != null) {
                jSONObject.put("event_id", l2);
            }
            Long l3 = b90Var.f8146e;
            if (l3 != null) {
                jSONObject.put("session_id", l3);
            }
            String str24 = b90Var.f8147f;
            if (str24 != null) {
                jSONObject.put("insert_id", str24);
            }
            String str25 = b90Var.f8127B;
            if (str25 != null) {
                jSONObject.put("library", str25);
            }
            String str26 = b90Var.f8136K;
            if (str26 != null) {
                jSONObject.put("partner_id", str26);
            }
            String str27 = b90Var.f8166y;
            if (str27 != null) {
                jSONObject.put("android_app_set_id", str27);
            }
            ny8 ny8Var = b90Var.f8129D;
            if (ny8Var != null) {
                String str28 = (String) ny8Var.f53417e;
                String str29 = (String) ny8Var.f53416d;
                String str30 = (String) ny8Var.f53415c;
                String str31 = (String) ny8Var.f53414b;
                JSONObject jSONObject2 = new JSONObject();
                if (str31 != null) {
                    try {
                        if (str31.length() != 0) {
                            jSONObject2.put("branch", str31);
                        }
                        if (str30 != null && str30.length() != 0) {
                            jSONObject2.put("source", str30);
                        }
                        if (str29 != null && str29.length() != 0) {
                            jSONObject2.put("version", str29);
                        }
                        if (str28 != null && str28.length() != 0) {
                            jSONObject2.put("versionId", str28);
                        }
                    } catch (JSONException unused) {
                        wi1 wi1Var = wi1.f66846b;
                        r8d.m20449b().mo16255a("JSON Serialization of tacking plan object failed");
                    }
                } else {
                    if (str30 != null) {
                        jSONObject2.put("source", str30);
                    }
                    if (str29 != null) {
                        jSONObject2.put("version", str29);
                    }
                    if (str28 != null) {
                        jSONObject2.put("versionId", str28);
                    }
                }
                jSONObject.put("plan", jSONObject2);
            }
            sc2 sc2Var = b90Var.f8130E;
            if (sc2Var != null) {
                String str32 = sc2Var.f60666b;
                String str33 = sc2Var.f60665a;
                JSONObject jSONObject3 = new JSONObject();
                if (str33 != null) {
                    try {
                        if (str33.length() != 0) {
                            jSONObject3.put("source_name", str33);
                        }
                        if (str32 != null && str32.length() != 0) {
                            jSONObject3.put("source_version", str32);
                        }
                    } catch (JSONException unused2) {
                        wi1 wi1Var2 = wi1.f66846b;
                        r8d.m20449b().mo16255a("JSON Serialization of ingestion metadata object failed");
                    }
                } else if (str32 != null) {
                    jSONObject3.put("source_version", str32);
                }
                jSONObject.put("ingestion_metadata", jSONObject3);
            }
            String string = jSONObject.toString();
            string.getClass();
            androidStorageV2$writeEvent$1.f10977a = this;
            androidStorageV2$writeEvent$1.f10978b = b90Var;
            androidStorageV2$writeEvent$1.f10981e = 1;
            if (this.f10992d.m5163k(string, androidStorageV2$writeEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b90Var = androidStorageV2$writeEvent$1.f10978b;
            AbstractC3193b.m15359b(obj);
        }
        b90Var.getClass();
        return xfa.f68157a;
    }
}
