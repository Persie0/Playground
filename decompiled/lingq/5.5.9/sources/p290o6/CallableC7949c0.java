package p290o6;

import android.content.Context;
import android.util.Log;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o6.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7949c0 implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f43286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7951d0 f43287b;

    public CallableC7949c0(C7951d0 c7951d0, String str) {
        this.f43287b = c7951d0;
        this.f43286a = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0119  */
    /* JADX WARN: Code duplicated, block: B:22:0x0121  */
    /* JADX WARN: Code duplicated, block: B:23:0x0126  */
    /* JADX WARN: Code duplicated, block: B:25:0x012c  */
    /* JADX WARN: Code duplicated, block: B:26:0x017c  */
    /* JADX WARN: Code duplicated, block: B:33:0x01ad A[Catch: all -> 0x0372, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:28:0x0181, B:29:0x01a6, B:33:0x01ad, B:64:0x02d5, B:66:0x02e1, B:67:0x02e4, B:81:0x0319, B:82:0x031a, B:58:0x026b, B:60:0x0273, B:61:0x02a9, B:90:0x0371, B:68:0x02e5, B:70:0x02ef, B:71:0x0303, B:75:0x0307, B:76:0x0314, B:35:0x01b1, B:36:0x01f0, B:53:0x024f, B:56:0x0269, B:30:0x01a7, B:31:0x01aa), top: B:94:0x0181, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:45:0x0236 A[Catch: all -> 0x024b, TryCatch #3 {, blocks: (B:39:0x01f4, B:43:0x01ff, B:45:0x0236, B:46:0x0247, B:52:0x024e), top: B:97:0x01f4, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x024d  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ef A[Catch: all -> 0x0316, TryCatch #1 {all -> 0x0316, blocks: (B:68:0x02e5, B:70:0x02ef, B:71:0x0303, B:75:0x0307, B:76:0x0314), top: B:95:0x02e5, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0306  */
    /* JADX WARN: Code duplicated, block: B:83:0x033f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:94:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x02e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x012c, please report this as an issue */
    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        String strM15758a;
        CleverTapInstanceConfig cleverTapInstanceConfig;
        String str;
        String str2;
        C7951d0 c7951d0 = this.f43287b;
        String str3 = this.f43286a;
        C2181a c2181aM15763g = c7951d0.m15763g();
        String str4 = c7951d0.f43294d.f10995a + ":async_deviceID";
        c2181aM15763g.getClass();
        C2181a.m6460m(str4, "Called initDeviceID()");
        if (c7951d0.f43294d.f11005k) {
            if (str3 == null) {
                String strM15768m = c7951d0.m15768m(18, new String[0]);
                C2181a c2181aM6433b = c7951d0.f43294d.m6433b();
                c2181aM6433b.getClass();
                if (c2181aM6433b.f11017a >= CleverTapAPI.LogLevel.INFO.intValue()) {
                    Log.i("CleverTap", strM15768m);
                }
            }
            C2181a c2181aM15763g2 = c7951d0.m15763g();
            String str5 = c7951d0.f43294d.f10995a + ":async_deviceID";
            c2181aM15763g2.getClass();
            C2181a.m6460m(str5, "Calling _getDeviceID");
            strM15758a = c7951d0.m15758a();
            C2181a c2181aM15763g3 = c7951d0.m15763g();
            String str6 = c7951d0.f43294d.f10995a + ":async_deviceID";
            c2181aM15763g3.getClass();
            C2181a.m6460m(str6, "Called _getDeviceID");
            boolean z10 = true;
            if (strM15758a != null || strM15758a.trim().length() <= 2) {
                cleverTapInstanceConfig = c7951d0.f43294d;
                if (cleverTapInstanceConfig.f11005k) {
                    c7951d0.m15759b(str3);
                } else if (cleverTapInstanceConfig.f10994N) {
                    synchronized (c7951d0) {
                        C2181a c2181aM15763g4 = c7951d0.m15763g();
                        String str7 = c7951d0.f43294d.f10995a + ":async_deviceID";
                        c2181aM15763g4.getClass();
                        C2181a.m6460m(str7, "fetchGoogleAdID() called!");
                        synchronized (c7951d0.f43291a) {
                            try {
                                str = c7951d0.f43298h;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (str != null && !c7951d0.f43292b) {
                            try {
                                c7951d0.f43292b = true;
                                Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, c7951d0.f43295e);
                                Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objInvoke, new Object[0]);
                                synchronized (c7951d0.f43291a) {
                                    if (bool != null) {
                                        if (!bool.booleanValue()) {
                                            z10 = false;
                                        }
                                        c7951d0.f43299i = z10;
                                        C2181a c2181aM15763g5 = c7951d0.m15763g();
                                        String str8 = c7951d0.f43294d.f10995a + ":async_deviceID";
                                        String str9 = "limitAdTracking = " + c7951d0.f43299i;
                                        c2181aM15763g5.getClass();
                                        C2181a.m6460m(str8, str9);
                                        if (c7951d0.f43299i) {
                                            C2181a c2181aM15763g6 = c7951d0.m15763g();
                                            String str10 = c7951d0.f43294d.f10995a;
                                            c2181aM15763g6.getClass();
                                            C2181a.m6452d(str10, "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                        } else {
                                            str2 = (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
                                            if (str2 != null && str2.trim().length() > 2) {
                                                synchronized (c7951d0.f43291a) {
                                                    try {
                                                        if (str2.contains("00000000")) {
                                                            C2181a c2181aM15763g7 = c7951d0.m15763g();
                                                            String str11 = c7951d0.f43294d.f10995a;
                                                            c2181aM15763g7.getClass();
                                                            C2181a.m6452d(str11, "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                                        } else {
                                                            c7951d0.f43298h = str2.replace("-", "");
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                            C2181a c2181aM15763g8 = c7951d0.m15763g();
                                            String str12 = c7951d0.f43294d.f10995a + ":async_deviceID";
                                            c2181aM15763g8.getClass();
                                            C2181a.m6460m(str12, "fetchGoogleAdID() done executing!");
                                        }
                                    } else {
                                        z10 = false;
                                        c7951d0.f43299i = z10;
                                        C2181a c2181aM15763g9 = c7951d0.m15763g();
                                        String str13 = c7951d0.f43294d.f10995a + ":async_deviceID";
                                        String str14 = "limitAdTracking = " + c7951d0.f43299i;
                                        c2181aM15763g9.getClass();
                                        C2181a.m6460m(str13, str14);
                                        if (c7951d0.f43299i) {
                                            C2181a c2181aM15763g10 = c7951d0.m15763g();
                                            String str15 = c7951d0.f43294d.f10995a;
                                            c2181aM15763g10.getClass();
                                            C2181a.m6452d(str15, "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                        } else {
                                            str2 = (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
                                            if (str2 != null) {
                                                synchronized (c7951d0.f43291a) {
                                                    if (str2.contains("00000000")) {
                                                        C2181a c2181aM15763g11 = c7951d0.m15763g();
                                                        String str16 = c7951d0.f43294d.f10995a;
                                                        c2181aM15763g11.getClass();
                                                        C2181a.m6452d(str16, "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                                    } else {
                                                        c7951d0.f43298h = str2.replace("-", "");
                                                    }
                                                }
                                            }
                                            C2181a c2181aM15763g12 = c7951d0.m15763g();
                                            String str17 = c7951d0.f43294d.f10995a + ":async_deviceID";
                                            c2181aM15763g12.getClass();
                                            C2181a.m6460m(str17, "fetchGoogleAdID() done executing!");
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                if (th4.getCause() != null) {
                                    C2181a c2181aM15763g13 = c7951d0.m15763g();
                                    String str18 = c7951d0.f43294d.f10995a;
                                    String str19 = "Failed to get Advertising ID: " + th4.toString() + th4.getCause().toString();
                                    c2181aM15763g13.getClass();
                                    C2181a.m6460m(str18, str19);
                                } else {
                                    C2181a c2181aM15763g14 = c7951d0.m15763g();
                                    String str20 = c7951d0.f43294d.f10995a;
                                    String str21 = "Failed to get Advertising ID: " + th4.toString();
                                    c2181aM15763g14.getClass();
                                    C2181a.m6460m(str20, str21);
                                }
                                str2 = null;
                            }
                        }
                    }
                    c7951d0.m15761d();
                    C2181a c2181aM15763g15 = c7951d0.m15763g();
                    String str22 = c7951d0.f43294d.f10995a + ":async_deviceID";
                    c2181aM15763g15.getClass();
                    C2181a.m6460m(str22, "initDeviceID() done executing!");
                } else {
                    C2181a c2181aM15763g16 = c7951d0.m15763g();
                    String str23 = c7951d0.f43294d.f10995a + ":async_deviceID";
                    c2181aM15763g16.getClass();
                    C2181a.m6460m(str23, "Calling generateDeviceID()");
                    c7951d0.m15761d();
                    C2181a c2181aM15763g17 = c7951d0.m15763g();
                    String str24 = c7951d0.f43294d.f10995a + ":async_deviceID";
                    c2181aM15763g17.getClass();
                    C2181a.m6460m(str24, "Called generateDeviceID()");
                }
            } else {
                C2181a c2181aM15763g18 = c7951d0.m15763g();
                String str25 = c7951d0.f43294d.f10995a;
                c2181aM15763g18.getClass();
                C2181a.m6460m(str25, "CleverTap ID already present for profile");
                if (str3 != null) {
                    c7951d0.m15763g().m6462g(c7951d0.f43294d.f10995a, c7951d0.m15768m(20, strM15758a, str3));
                }
            }
            return null;
        }
        if (str3 != null) {
            String strM15768m2 = c7951d0.m15768m(19, new String[0]);
            C2181a c2181aM6433b2 = c7951d0.f43294d.m6433b();
            c2181aM6433b2.getClass();
            if (c2181aM6433b2.f11017a >= CleverTapAPI.LogLevel.INFO.intValue()) {
                Log.i("CleverTap", strM15768m2);
            }
        }
        C2181a c2181aM15763g19 = c7951d0.m15763g();
        String str26 = c7951d0.f43294d.f10995a + ":async_deviceID";
        c2181aM15763g19.getClass();
        C2181a.m6460m(str26, "Calling _getDeviceID");
        strM15758a = c7951d0.m15758a();
        C2181a c2181aM15763g20 = c7951d0.m15763g();
        String str27 = c7951d0.f43294d.f10995a + ":async_deviceID";
        c2181aM15763g20.getClass();
        C2181a.m6460m(str27, "Called _getDeviceID");
        boolean z11 = true;
        if (strM15758a != null) {
            cleverTapInstanceConfig = c7951d0.f43294d;
            if (cleverTapInstanceConfig.f11005k) {
                c7951d0.m15759b(str3);
            } else if (cleverTapInstanceConfig.f10994N) {
                C2181a c2181aM15763g110 = c7951d0.m15763g();
                String str28 = c7951d0.f43294d.f10995a + ":async_deviceID";
                c2181aM15763g110.getClass();
                C2181a.m6460m(str28, "Calling generateDeviceID()");
                c7951d0.m15761d();
                C2181a c2181aM15763g111 = c7951d0.m15763g();
                String str29 = c7951d0.f43294d.f10995a + ":async_deviceID";
                c2181aM15763g111.getClass();
                C2181a.m6460m(str29, "Called generateDeviceID()");
            } else {
                synchronized (c7951d0) {
                    C2181a c2181aM15763g21 = c7951d0.m15763g();
                    String str30 = c7951d0.f43294d.f10995a + ":async_deviceID";
                    c2181aM15763g21.getClass();
                    C2181a.m6460m(str30, "fetchGoogleAdID() called!");
                    synchronized (c7951d0.f43291a) {
                        str = c7951d0.f43298h;
                        if (str != null) {
                        }
                        c7951d0.m15761d();
                        C2181a c2181aM15763g112 = c7951d0.m15763g();
                        String str210 = c7951d0.f43294d.f10995a + ":async_deviceID";
                        c2181aM15763g112.getClass();
                        C2181a.m6460m(str210, "initDeviceID() done executing!");
                    }
                }
            }
        } else {
            cleverTapInstanceConfig = c7951d0.f43294d;
            if (cleverTapInstanceConfig.f11005k) {
                c7951d0.m15759b(str3);
            } else if (cleverTapInstanceConfig.f10994N) {
                C2181a c2181aM15763g113 = c7951d0.m15763g();
                String str211 = c7951d0.f43294d.f10995a + ":async_deviceID";
                c2181aM15763g113.getClass();
                C2181a.m6460m(str211, "Calling generateDeviceID()");
                c7951d0.m15761d();
                C2181a c2181aM15763g114 = c7951d0.m15763g();
                String str212 = c7951d0.f43294d.f10995a + ":async_deviceID";
                c2181aM15763g114.getClass();
                C2181a.m6460m(str212, "Called generateDeviceID()");
            } else {
                synchronized (c7951d0) {
                    C2181a c2181aM15763g22 = c7951d0.m15763g();
                    String str31 = c7951d0.f43294d.f10995a + ":async_deviceID";
                    c2181aM15763g22.getClass();
                    C2181a.m6460m(str31, "fetchGoogleAdID() called!");
                    synchronized (c7951d0.f43291a) {
                        str = c7951d0.f43298h;
                        if (str != null) {
                        }
                        c7951d0.m15761d();
                        C2181a c2181aM15763g115 = c7951d0.m15763g();
                        String str213 = c7951d0.f43294d.f10995a + ":async_deviceID";
                        c2181aM15763g115.getClass();
                        C2181a.m6460m(str213, "initDeviceID() done executing!");
                    }
                }
            }
        }
        return null;
    }
}
