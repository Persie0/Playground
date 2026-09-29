package p317p7;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import dm.C5207g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import p067d8.C5086z;
import p291o7.C8004n;
import p476x7.C10106e;

/* JADX INFO: renamed from: p7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8196c {

    /* JADX INFO: renamed from: a */
    public static final String f44380a;

    /* JADX INFO: renamed from: p7.c$a */
    public static final class a extends ObjectInputStream {
        public a(BufferedInputStream bufferedInputStream) {
            super(bufferedInputStream);
        }

        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (C5207g.m11106a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                classDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (C5207g.m11106a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                classDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            C5207g.m11110e(classDescriptor, "resultClassDescriptor");
            return classDescriptor;
        }
    }

    static {
        new C8196c();
        f44380a = C8196c.class.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0077: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:32:0x0076 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static final synchronized PersistedEvents m16319a() {
        a aVar;
        Closeable closeable;
        String str;
        PersistedEvents persistedEvents;
        int i10 = C10106e.f51261a;
        Context contextM15871a = C8004n.m15871a();
        Closeable closeable2 = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextM15871a.openFileInput("AppEventsLogger.persistedevents");
                C5207g.m11110e(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = aVar.readObject();
                    if (object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                    }
                    PersistedEvents persistedEvents2 = (PersistedEvents) object;
                    C5086z.m10820e(aVar);
                    try {
                        contextM15871a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e10) {
                        Log.w(f44380a, "Got unexpected exception when removing events file: ", e10);
                    }
                    persistedEvents = persistedEvents2;
                    if (persistedEvents == 0) {
                        persistedEvents = new PersistedEvents();
                    }
                } catch (FileNotFoundException unused) {
                    C5086z.m10820e(aVar);
                    try {
                        contextM15871a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        persistedEvents = closeable2;
                    } catch (Exception e11) {
                        e = e11;
                        str = f44380a;
                        Log.w(str, "Got unexpected exception when removing events file: ", e);
                        persistedEvents = closeable2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    Log.w(f44380a, "Got unexpected exception while reading events: ", e);
                    C5086z.m10820e(aVar);
                    try {
                        contextM15871a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        persistedEvents = closeable2;
                    } catch (Exception e13) {
                        e = e13;
                        str = f44380a;
                        Log.w(str, "Got unexpected exception when removing events file: ", e);
                        persistedEvents = closeable2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                C5086z.m10820e(closeable2);
                try {
                    contextM15871a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e14) {
                    Log.w(f44380a, "Got unexpected exception when removing events file: ", e14);
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            aVar = null;
        } catch (Exception e15) {
            e = e15;
            aVar = null;
        } catch (Throwable th3) {
            th = th3;
            C5086z.m10820e(closeable2);
            contextM15871a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            throw th;
        }
        return persistedEvents;
    }

    /* JADX INFO: renamed from: b */
    public static final void m16320b(PersistedEvents persistedEvents) {
        ObjectOutputStream objectOutputStream;
        Context contextM15871a = C8004n.m15871a();
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextM15871a.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(persistedEvents);
            } catch (Throwable th2) {
                th = th2;
                try {
                    Log.w(f44380a, "Got unexpected exception while persisting events: ", th);
                    try {
                        contextM15871a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } catch (Throwable th3) {
                    C5086z.m10820e(objectOutputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
        }
        C5086z.m10820e(objectOutputStream);
    }
}
