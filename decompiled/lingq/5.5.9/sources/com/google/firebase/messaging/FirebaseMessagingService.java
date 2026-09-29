package com.google.firebase.messaging;

import ae.C0065e;
import ae.C0066f;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C3219a;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.kochava.tracker.BuildConfig;
import ge.C5789m;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p073df.InterfaceC5162d;
import p178if.C6325a;
import p276nb.ThreadFactoryC7736a;
import p395t8.C9219a;
import p395t8.C9220b;
import p395t8.InterfaceC9224f;
import p452w8.C9840u;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC3245h {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C3253p.m9275l(extras)) {
            C3253p c3253p = new C3253p(extras);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC7736a("Firebase-Messaging-Network-Io"));
            try {
                if (new C3243g(this, c3253p, executorServiceNewSingleThreadExecutor).m9256a()) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (C3251n.m9270b(intent)) {
                        C3251n.m9269a(intent.getExtras(), "_nf");
                    }
                }
            } catch (Throwable th2) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th2;
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            return;
        }
        passMessageIntentToSdk(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:126:0x0215  */
    /* JADX WARN: Code duplicated, block: B:129:0x021f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0232  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    private void passMessageIntentToSdk(Intent intent) {
        byte b10;
        boolean z10;
        long j10;
        C0065e c0065eM434b;
        C0066f c0066f;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        int iIntValue = 0;
        switch (stringExtra) {
            case "deleted_messages":
                b10 = 0;
                break;
            case "gcm":
                b10 = 1;
                break;
            case "send_error":
                b10 = 2;
                break;
            case "send_event":
                b10 = 3;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            onDeletedMessages();
            return;
        }
        if (b10 != 1) {
            if (b10 == 2) {
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                return;
            } else if (b10 != 3) {
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                return;
            } else {
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            }
        }
        if (C3251n.m9270b(intent)) {
            C3251n.m9269a(intent.getExtras(), "_nr");
        }
        if (ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
            z10 = false;
        } else {
            try {
                C0065e.m434b();
                C0065e c0065eM434b2 = C0065e.m434b();
                c0065eM434b2.m437a();
                Context context = c0065eM434b2.f171a;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                if (sharedPreferences.contains("export_to_big_query")) {
                    z10 = sharedPreferences.getBoolean("export_to_big_query", false);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                            z10 = false;
                        } else {
                            z10 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } catch (IllegalStateException unused2) {
                Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            }
        }
        if (z10) {
            MessagingClientEvent.Event event = MessagingClientEvent.Event.MESSAGE_DELIVERED;
            InterfaceC9224f interfaceC9224f = FirebaseMessaging.f16305n;
            if (interfaceC9224f == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                int i10 = MessagingClientEvent.f16419p;
                MessagingClientEvent.MessageType messageType = MessagingClientEvent.MessageType.UNKNOWN;
                MessagingClientEvent.SDKPlatform sDKPlatform = MessagingClientEvent.SDKPlatform.UNKNOWN_OS;
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused3) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i11 = iIntValue;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        C0065e c0065eM434b3 = C0065e.m434b();
                        Object obj2 = C3219a.f16252m;
                        c0065eM434b3.m437a();
                        string = (String) Tasks.m8537a(((C3219a) c0065eM434b3.f174d.mo11748a(InterfaceC5162d.class)).getId());
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                String str4 = string;
                C0065e c0065eM434b4 = C0065e.m434b();
                c0065eM434b4.m437a();
                String packageName = c0065eM434b4.f171a.getPackageName();
                MessagingClientEvent.SDKPlatform sDKPlatform2 = MessagingClientEvent.SDKPlatform.ANDROID;
                MessagingClientEvent.MessageType messageType2 = C3253p.m9275l(extras) ? MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent.MessageType.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str5 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 == null || !string3.startsWith("/topics/")) {
                    string3 = null;
                }
                String str6 = string3 != null ? string3 : "";
                String string4 = extras.getString("collapse_key");
                String str7 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str8 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str9 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j10 = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e11) {
                        Log.w("FirebaseMessaging", "error parsing project number", e11);
                        c0065eM434b = C0065e.m434b();
                        c0065eM434b.m437a();
                        c0066f = c0065eM434b.f173c;
                        str = c0066f.f187e;
                        if (str != null) {
                            try {
                                j10 = Long.parseLong(str);
                            } catch (NumberFormatException e12) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e12);
                                c0065eM434b.m437a();
                                str2 = c0066f.f184b;
                                if (str2.startsWith("1:")) {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length < 2) {
                                        j10 = 0;
                                    } else {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j10 = 0;
                                        } else {
                                            try {
                                                j10 = Long.parseLong(str3);
                                            } catch (NumberFormatException e13) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e13);
                                                j10 = 0;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        j10 = Long.parseLong(str2);
                                    } catch (NumberFormatException e14) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                        j10 = 0;
                                    }
                                }
                            }
                        } else {
                            c0065eM434b.m437a();
                            str2 = c0066f.f184b;
                            if (str2.startsWith("1:")) {
                                j10 = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length < 2) {
                                    j10 = 0;
                                } else {
                                    str3 = strArrSplit[1];
                                    if (str3.isEmpty()) {
                                        j10 = 0;
                                    } else {
                                        j10 = Long.parseLong(str3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    c0065eM434b = C0065e.m434b();
                    c0065eM434b.m437a();
                    c0066f = c0065eM434b.f173c;
                    str = c0066f.f187e;
                    if (str != null) {
                        j10 = Long.parseLong(str);
                    } else {
                        c0065eM434b.m437a();
                        str2 = c0066f.f184b;
                        if (str2.startsWith("1:")) {
                            j10 = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(":");
                            if (strArrSplit.length < 2) {
                                j10 = 0;
                            } else {
                                str3 = strArrSplit[1];
                                if (str3.isEmpty()) {
                                    j10 = 0;
                                } else {
                                    j10 = Long.parseLong(str3);
                                }
                            }
                        }
                    }
                }
                MessagingClientEvent messagingClientEvent = new MessagingClientEvent(j10 > 0 ? j10 : 0L, str5, str4, messageType2, sDKPlatform2, packageName, str7, i11, str6, event, str8, str9);
                try {
                    C9840u c9840uMo17582a = interfaceC9224f.mo17582a("FCM_CLIENT_EVENT_LOGGING", new C9220b("proto"), new C5789m(23));
                    C9219a c9219a = new C9219a(new C6325a(messagingClientEvent), Priority.DEFAULT);
                    c9840uMo17582a.getClass();
                    c9840uMo17582a.m18332a(c9219a, new C5789m(2));
                } catch (RuntimeException e15) {
                    Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
                }
            }
        }
        dispatchMessage(intent);
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3245h
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) C3258u.m9290a().f16441d.poll();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3245h
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        handleMessageIntent(intent);
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
