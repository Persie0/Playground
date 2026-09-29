package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5207g;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p213k4.InterfaceC6584d;
import p213k4.InterfaceC6585e;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a */
    public int f7504a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f7505b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final RemoteCallbackListC1179b f7506c = new RemoteCallbackListC1179b();

    /* JADX INFO: renamed from: d */
    public final BinderC1178a f7507d = new BinderC1178a();

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public static final class BinderC1178a extends InterfaceC6585e.a {
        public BinderC1178a() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p213k4.InterfaceC6585e
        /* JADX INFO: renamed from: T0 */
        public final void mo4546T0(int i10, String[] strArr) {
            C5207g.m11111f(strArr, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f7506c) {
                try {
                    String str = (String) multiInstanceInvalidationService.f7505b.get(Integer.valueOf(i10));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.f7506c.beginBroadcast();
                    for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.f7506c.getBroadcastCookie(i11);
                            C5207g.m11109d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) broadcastCookie).intValue();
                            String str2 = (String) multiInstanceInvalidationService.f7505b.get(Integer.valueOf(iIntValue));
                            if (i10 != iIntValue && C5207g.m11106a(str, str2)) {
                                try {
                                    multiInstanceInvalidationService.f7506c.getBroadcastItem(i11).mo13173I(strArr);
                                } catch (RemoteException e10) {
                                    Log.w("ROOM", "Error invoking a remote callback", e10);
                                }
                            }
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService.f7506c.finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService.f7506c.finishBroadcast();
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p213k4.InterfaceC6585e
        /* JADX INFO: renamed from: n */
        public final int mo4547n(InterfaceC6584d interfaceC6584d, String str) {
            C5207g.m11111f(interfaceC6584d, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f7506c) {
                try {
                    int i11 = multiInstanceInvalidationService.f7504a + 1;
                    multiInstanceInvalidationService.f7504a = i11;
                    if (multiInstanceInvalidationService.f7506c.register(interfaceC6584d, Integer.valueOf(i11))) {
                        multiInstanceInvalidationService.f7505b.put(Integer.valueOf(i11), str);
                        i10 = i11;
                    } else {
                        multiInstanceInvalidationService.f7504a--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p213k4.InterfaceC6585e
        /* JADX INFO: renamed from: n0 */
        public final void mo4548n0(InterfaceC6584d interfaceC6584d, int i10) {
            C5207g.m11111f(interfaceC6584d, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f7506c) {
                try {
                    multiInstanceInvalidationService.f7506c.unregister(interfaceC6584d);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public static final class RemoteCallbackListC1179b extends RemoteCallbackList<InterfaceC6584d> {
        public RemoteCallbackListC1179b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            C5207g.m11111f((InterfaceC6584d) iInterface, "callback");
            C5207g.m11111f(obj, "cookie");
            MultiInstanceInvalidationService.this.f7505b.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C5207g.m11111f(intent, "intent");
        return this.f7507d;
    }
}
