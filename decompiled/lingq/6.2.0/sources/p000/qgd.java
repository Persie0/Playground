package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import com.iterable.iterableapi.IterablePushActionReceiver;
import com.iterable.iterableapi.IterableTrampolineActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qgd {
    /* JADX WARN: Code duplicated, block: B:100:0x01db  */
    /* JADX WARN: Code duplicated, block: B:103:0x021e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0258  */
    /* JADX WARN: Code duplicated, block: B:109:0x0263  */
    /* JADX WARN: Code duplicated, block: B:111:0x028c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0297  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02de  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:125:0x0306  */
    /* JADX WARN: Code duplicated, block: B:128:0x0310 A[LOOP:1: B:126:0x030a->B:128:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0324  */
    /* JADX WARN: Code duplicated, block: B:135:0x0336  */
    /* JADX WARN: Code duplicated, block: B:136:0x0339  */
    /* JADX WARN: Code duplicated, block: B:140:0x0359 A[LOOP:0: B:107:0x025d->B:140:0x0359, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0385 A[Catch: NameNotFoundException -> 0x0394, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0394, blocks: (B:142:0x0373, B:144:0x0385, B:145:0x038b, B:149:0x0396), top: B:187:0x0373 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:157:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f6 A[LOOP:2: B:163:0x03e2->B:167:0x03f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0408  */
    /* JADX WARN: Code duplicated, block: B:173:0x0410  */
    /* JADX WARN: Code duplicated, block: B:176:0x041d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0363 A[EDGE_INSN: B:197:0x0363->B:141:0x0363 BREAK  A[LOOP:0: B:107:0x025d->B:140:0x0359], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cf  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x021e, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static kc4 m19954a(Context context, Bundle bundle) {
        String strReplaceFirst;
        String str;
        Uri uri;
        String string;
        String string2;
        String str2;
        String str3;
        int identifier;
        String str4;
        String str5;
        ArrayList<lc4> arrayList;
        int i;
        Notification notification;
        NotificationManager notificationManager;
        NotificationManager notificationManager2;
        NotificationChannel notificationChannel;
        String str6;
        int i2;
        String strM16184a;
        StatusBarNotification[] activeNotifications;
        int length;
        Bundle bundle2;
        int i3;
        Intent intent;
        String str7;
        int i4;
        String str8;
        PendingIntent broadcast;
        ArrayList<j58> arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        j58[] j58VarArr;
        int iIntValue;
        String str9;
        Bundle bundle3 = bundle;
        if (bundle3 == null) {
            eh0.m11121R("IterableNotification", "Notification extras is null. Skipping.");
            return null;
        }
        String string3 = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        if (!bundle3.containsKey("itbl")) {
            eh0.m11121R("IterableNotification", "Notification doesn't have an Iterable payload. Skipping.");
            return null;
        }
        if (lgd.m16185b(bundle3)) {
            eh0.m11121R("IterableNotification", "Received a ghost push notification. Skipping.");
            return null;
        }
        String string4 = bundle3.getString("title", string3);
        String string5 = bundle3.getString("body");
        String string6 = bundle3.getString("sound");
        if (string6 != null) {
            if (string6.contains("https")) {
                str9 = string6;
                string6 = string6.substring(string6.lastIndexOf(47) + 1);
            } else {
                str9 = null;
            }
            String str10 = str9;
            strReplaceFirst = string6.replaceFirst("[.][^.]+$", "");
            str = str10;
        } else {
            strReplaceFirst = string6;
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            int identifier2 = strReplaceFirst != null ? context.getResources().getIdentifier(strReplaceFirst, "raw", context.getPackageName()) : 0;
            uri = identifier2 == 0 ? Settings.System.DEFAULT_NOTIFICATION_URI : Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier2);
        }
        Uri uri2 = uri;
        if (uri2 == Settings.System.DEFAULT_NOTIFICATION_URI) {
            try {
                Bundle bundle4 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle4 != null) {
                    Object obj = bundle4.get("iterable_notification_channel_name");
                    string = obj instanceof String ? (String) obj : (!(obj instanceof Integer) || (iIntValue = ((Integer) obj).intValue()) == 0) ? null : context.getString(iIntValue);
                    try {
                        eh0.m11133m("IterableNotification", "channel name: " + string);
                    } catch (Exception e) {
                        e = e;
                        eh0.m11136q("IterableNotification", "Error while retrieving channel name", e);
                    }
                } else {
                    string = null;
                }
            } catch (Exception e2) {
                e = e2;
                string = null;
            }
            if (string == null) {
                string = "iterable channel";
            }
        } else {
            string = strReplaceFirst;
        }
        String packageName = uri2 == Settings.System.DEFAULT_NOTIFICATION_URI ? context.getPackageName() : lgd.m16184a(context, strReplaceFirst, true);
        kc4 kc4Var = new kc4(context, packageName);
        String string7 = bundle3.getString("itbl");
        try {
            JSONObject jSONObject = new JSONObject(string7);
            string2 = jSONObject.has("attachment-url") ? jSONObject.getString("attachment-url") : null;
        } catch (JSONException e3) {
            eh0.m11121R("IterableNotification", e3.toString());
            string2 = null;
        }
        mc4 mc4Var = new mc4(string7);
        String str11 = mc4Var.f51070c;
        Notification notification2 = new Notification();
        notification2.defaults |= 4;
        try {
            try {
                str2 = string;
                try {
                    str3 = packageName;
                    try {
                        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                        Bundle bundle5 = applicationInfo.metaData;
                        if (bundle5 != null) {
                            identifier = bundle5.getInt("iterable_notification_icon", 0);
                            try {
                                eh0.m11133m("IterableNotification", "iconID: " + applicationInfo.metaData.get("iterable_notification_icon"));
                            } catch (PackageManager.NameNotFoundException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } else {
                            identifier = 0;
                        }
                    } catch (PackageManager.NameNotFoundException e5) {
                        e = e5;
                        identifier = 0;
                        e.printStackTrace();
                        if (identifier == 0) {
                            Resources resources = context.getResources();
                            fb4 fb4Var = fb4.f38769t;
                            identifier = resources.getIdentifier(context.getSharedPreferences("iterable_notification_icon", 0).getString("iterable_notification_icon", ""), "drawable", context.getPackageName());
                        }
                        if (identifier == 0) {
                            if (context.getApplicationInfo().icon != 0) {
                                eh0.m11133m("IterableNotification", "No Notification Icon defined - defaulting to app icon");
                                identifier = context.getApplicationInfo().icon;
                            } else {
                                eh0.m11121R("IterableNotification", "No Notification Icon defined - push notifications will not be displayed");
                            }
                        }
                        kc4Var.f65600t.icon = identifier;
                        kc4Var.m23424p(string3);
                        kc4Var.m23418j(16, true);
                        kc4Var.f65585e = vm6.m23410d(string4);
                        kc4Var.f65590j = 1;
                        kc4Var.m23416h(string5);
                        kc4Var.f65591k = true;
                        kc4Var.f47024w = string2;
                        kc4Var.f47025x = string5;
                        kc4Var.f47026y = Math.abs((int) System.currentTimeMillis());
                        eh0.m11133m("IterableNotification", "Request code = " + kc4Var.f47026y);
                        if (str11 != null) {
                            kc4Var.f47026y = Math.abs(str11.hashCode());
                            eh0.m11133m("IterableNotification", "Request code = " + kc4Var.f47026y);
                        }
                        str4 = "com.iterable.push.ACTION_PUSH_ACTION";
                        Intent intent2 = new Intent("com.iterable.push.ACTION_PUSH_ACTION");
                        intent2.setClass(context, IterableTrampolineActivity.class);
                        intent2.putExtras(bundle3);
                        str5 = "actionIdentifier";
                        intent2.putExtra("actionIdentifier", "default");
                        intent2.setFlags(268435456);
                        arrayList = mc4Var.f51073f;
                        if (arrayList != null) {
                            i3 = 0;
                            for (lc4 lc4Var : arrayList) {
                                intent = new Intent(str4);
                                intent.putExtras(bundle3);
                                intent.putExtra("requestCode", kc4Var.f47026y);
                                intent.putExtra(str5, lc4Var.f49466a);
                                intent.putExtra(str5, lc4Var.f49466a);
                                str7 = lc4Var.f49468c;
                                if (str7.equals("textInput")) {
                                    i4 = 167772160;
                                } else {
                                    i4 = 201326592;
                                }
                                str8 = str5;
                                if (lc4Var.f49469d) {
                                    eh0.m11133m("IterableNotification", "Go through TrampolineActivity");
                                    intent.setClass(context, IterableTrampolineActivity.class);
                                    intent.setFlags(268435456);
                                    broadcast = PendingIntent.getActivity(context, intent.hashCode(), intent, i4);
                                } else {
                                    eh0.m11133m("IterableNotification", "Go through IterablePushActionReceiver");
                                    intent.setClass(context, IterablePushActionReceiver.class);
                                    broadcast = PendingIntent.getBroadcast(context, intent.hashCode(), intent, i4);
                                }
                                PendingIntent pendingIntent = broadcast;
                                String str12 = lc4Var.f49467b;
                                Bundle bundle6 = new Bundle();
                                CharSequence charSequenceM23410d = vm6.m23410d(str12);
                                if (str7.equals("textInput")) {
                                    j58 j58Var = new j58(lc4Var.f49470e, new Bundle(), new HashSet());
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(j58Var);
                                } else {
                                    arrayList2 = null;
                                }
                                arrayList3 = new ArrayList();
                                arrayList4 = new ArrayList();
                                if (arrayList2 != null) {
                                    for (j58 j58Var2 : arrayList2) {
                                        j58Var2.getClass();
                                        arrayList4.add(j58Var2);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                }
                                if (arrayList4.isEmpty()) {
                                    j58VarArr = null;
                                } else {
                                    j58VarArr = (j58[]) arrayList4.toArray(new j58[arrayList4.size()]);
                                }
                                kc4Var.m23412b(new pm6(null, charSequenceM23410d, pendingIntent, bundle6, j58VarArr));
                                i3++;
                                if (i3 == 3) {
                                    break;
                                }
                                bundle3 = bundle;
                                str4 = str4;
                                str5 = str8;
                            }
                        }
                        kc4Var.f65587g = PendingIntent.getActivity(context, kc4Var.f47026y, intent2, 201326592);
                        kc4Var.f47023v = lgd.m16185b(bundle);
                        bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle2 != null) {
                            int color = bundle2.getInt("iterable_notification_color");
                            try {
                                color = context.getResources().getColor(color);
                            } catch (Resources.NotFoundException unused) {
                            }
                            kc4Var.f65595o = color;
                        }
                        if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
                            notification2.defaults |= 2;
                        }
                        i = notification2.defaults;
                        notification = kc4Var.f65600t;
                        notification.defaults = i;
                        if ((i & 4) != 0) {
                            notification.flags |= 1;
                        }
                        notificationManager = (NotificationManager) context.getApplicationContext().getSystemService("notification");
                        if (notificationManager != null) {
                            i2 = 0;
                            strM16184a = lgd.m16184a(context, strReplaceFirst, false);
                            if (notificationManager.getNotificationChannel(strM16184a) != null) {
                                activeNotifications = notificationManager.getActiveNotifications();
                                length = activeNotifications.length;
                                while (true) {
                                    if (i2 >= length) {
                                        notificationManager.deleteNotificationChannel(strM16184a);
                                        break;
                                    }
                                    if (activeNotifications[i2].getNotification().getChannelId() == strM16184a) {
                                        eh0.m11133m("IterableNotification", "Not Deleting the channel as there are active notification for old channel");
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                        notificationManager2 = (NotificationManager) context.getApplicationContext().getSystemService("notification");
                        if (notificationManager2 != null) {
                            String str13 = str3;
                            notificationChannel = notificationManager2.getNotificationChannel(str13);
                            if (notificationChannel != null) {
                                str6 = str2;
                                if (!notificationChannel.getName().equals(str6)) {
                                }
                            } else {
                                str6 = str2;
                            }
                            eh0.m11133m("IterableNotification", ux5.m22991n("Creating notification: channelId = ", str13, " channelName = ", str6, " channelDescription = "));
                            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
                            NotificationChannel notificationChannel2 = new NotificationChannel(str13, str6, 4);
                            notificationChannel2.setDescription("");
                            notificationChannel2.enableLights(true);
                            notificationChannel2.setShowBadge(lgd.m16186c(context));
                            notificationChannel2.setSound(uri2, audioAttributesBuild);
                            notificationManager2.createNotificationChannel(notificationChannel2);
                        }
                        return kc4Var;
                    }
                } catch (PackageManager.NameNotFoundException e6) {
                    e = e6;
                    str3 = packageName;
                    identifier = 0;
                    e.printStackTrace();
                    if (identifier == 0) {
                        Resources resources2 = context.getResources();
                        fb4 fb4Var2 = fb4.f38769t;
                        identifier = resources2.getIdentifier(context.getSharedPreferences("iterable_notification_icon", 0).getString("iterable_notification_icon", ""), "drawable", context.getPackageName());
                    }
                    if (identifier == 0) {
                        if (context.getApplicationInfo().icon != 0) {
                            eh0.m11133m("IterableNotification", "No Notification Icon defined - defaulting to app icon");
                            identifier = context.getApplicationInfo().icon;
                        } else {
                            eh0.m11121R("IterableNotification", "No Notification Icon defined - push notifications will not be displayed");
                        }
                    }
                    kc4Var.f65600t.icon = identifier;
                    kc4Var.m23424p(string3);
                    kc4Var.m23418j(16, true);
                    kc4Var.f65585e = vm6.m23410d(string4);
                    kc4Var.f65590j = 1;
                    kc4Var.m23416h(string5);
                    kc4Var.f65591k = true;
                    kc4Var.f47024w = string2;
                    kc4Var.f47025x = string5;
                    kc4Var.f47026y = Math.abs((int) System.currentTimeMillis());
                    eh0.m11133m("IterableNotification", "Request code = " + kc4Var.f47026y);
                    if (str11 != null) {
                        kc4Var.f47026y = Math.abs(str11.hashCode());
                        eh0.m11133m("IterableNotification", "Request code = " + kc4Var.f47026y);
                    }
                    str4 = "com.iterable.push.ACTION_PUSH_ACTION";
                    Intent intent3 = new Intent("com.iterable.push.ACTION_PUSH_ACTION");
                    intent3.setClass(context, IterableTrampolineActivity.class);
                    intent3.putExtras(bundle3);
                    str5 = "actionIdentifier";
                    intent3.putExtra("actionIdentifier", "default");
                    intent3.setFlags(268435456);
                    arrayList = mc4Var.f51073f;
                    if (arrayList != null) {
                        i3 = 0;
                        while (r9.hasNext()) {
                            intent = new Intent(str4);
                            intent.putExtras(bundle3);
                            intent.putExtra("requestCode", kc4Var.f47026y);
                            intent.putExtra(str5, lc4Var.f49466a);
                            intent.putExtra(str5, lc4Var.f49466a);
                            str7 = lc4Var.f49468c;
                            if (str7.equals("textInput")) {
                                i4 = 167772160;
                            } else {
                                i4 = 201326592;
                            }
                            str8 = str5;
                            if (lc4Var.f49469d) {
                                eh0.m11133m("IterableNotification", "Go through TrampolineActivity");
                                intent.setClass(context, IterableTrampolineActivity.class);
                                intent.setFlags(268435456);
                                broadcast = PendingIntent.getActivity(context, intent.hashCode(), intent, i4);
                            } else {
                                eh0.m11133m("IterableNotification", "Go through IterablePushActionReceiver");
                                intent.setClass(context, IterablePushActionReceiver.class);
                                broadcast = PendingIntent.getBroadcast(context, intent.hashCode(), intent, i4);
                            }
                            PendingIntent pendingIntent2 = broadcast;
                            String str14 = lc4Var.f49467b;
                            Bundle bundle7 = new Bundle();
                            CharSequence charSequenceM23410d2 = vm6.m23410d(str14);
                            if (str7.equals("textInput")) {
                                j58 j58Var3 = new j58(lc4Var.f49470e, new Bundle(), new HashSet());
                                arrayList2 = new ArrayList();
                                arrayList2.add(j58Var3);
                            } else {
                                arrayList2 = null;
                            }
                            arrayList3 = new ArrayList();
                            arrayList4 = new ArrayList();
                            if (arrayList2 != null) {
                                while (r2.hasNext()) {
                                    j58Var2.getClass();
                                    arrayList4.add(j58Var2);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                            }
                            if (arrayList4.isEmpty()) {
                                j58VarArr = null;
                            } else {
                                j58VarArr = (j58[]) arrayList4.toArray(new j58[arrayList4.size()]);
                            }
                            kc4Var.m23412b(new pm6(null, charSequenceM23410d2, pendingIntent2, bundle7, j58VarArr));
                            i3++;
                            if (i3 == 3) {
                                break;
                                break;
                            }
                            bundle3 = bundle;
                            str4 = str4;
                            str5 = str8;
                        }
                    }
                    kc4Var.f65587g = PendingIntent.getActivity(context, kc4Var.f47026y, intent3, 201326592);
                    kc4Var.f47023v = lgd.m16185b(bundle);
                    bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle2 != null) {
                        int color2 = bundle2.getInt("iterable_notification_color");
                        color2 = context.getResources().getColor(color2);
                        kc4Var.f65595o = color2;
                    }
                    if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
                        notification2.defaults |= 2;
                    }
                    i = notification2.defaults;
                    notification = kc4Var.f65600t;
                    notification.defaults = i;
                    if ((i & 4) != 0) {
                        notification.flags |= 1;
                    }
                    notificationManager = (NotificationManager) context.getApplicationContext().getSystemService("notification");
                    if (notificationManager != null) {
                        i2 = 0;
                        strM16184a = lgd.m16184a(context, strReplaceFirst, false);
                        if (notificationManager.getNotificationChannel(strM16184a) != null) {
                            activeNotifications = notificationManager.getActiveNotifications();
                            length = activeNotifications.length;
                            while (true) {
                                if (i2 >= length) {
                                    notificationManager.deleteNotificationChannel(strM16184a);
                                    break;
                                }
                                if (activeNotifications[i2].getNotification().getChannelId() == strM16184a) {
                                    eh0.m11133m("IterableNotification", "Not Deleting the channel as there are active notification for old channel");
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    notificationManager2 = (NotificationManager) context.getApplicationContext().getSystemService("notification");
                    if (notificationManager2 != null) {
                        String str15 = str3;
                        notificationChannel = notificationManager2.getNotificationChannel(str15);
                        if (notificationChannel != null) {
                            str6 = str2;
                            if (!notificationChannel.getName().equals(str6)) {
                            }
                        } else {
                            str6 = str2;
                        }
                        eh0.m11133m("IterableNotification", ux5.m22991n("Creating notification: channelId = ", str15, " channelName = ", str6, " channelDescription = "));
                        AudioAttributes audioAttributesBuild2 = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
                        NotificationChannel notificationChannel3 = new NotificationChannel(str15, str6, 4);
                        notificationChannel3.setDescription("");
                        notificationChannel3.enableLights(true);
                        notificationChannel3.setShowBadge(lgd.m16186c(context));
                        notificationChannel3.setSound(uri2, audioAttributesBuild2);
                        notificationManager2.createNotificationChannel(notificationChannel3);
                    }
                    return kc4Var;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                e = e7;
                str2 = string;
            }
            bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle2 != null) {
                int color3 = bundle2.getInt("iterable_notification_color");
                color3 = context.getResources().getColor(color3);
                kc4Var.f65595o = color3;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
        }
        if (identifier == 0) {
            Resources resources3 = context.getResources();
            fb4 fb4Var3 = fb4.f38769t;
            identifier = resources3.getIdentifier(context.getSharedPreferences("iterable_notification_icon", 0).getString("iterable_notification_icon", ""), "drawable", context.getPackageName());
        }
        if (identifier == 0) {
            if (context.getApplicationInfo().icon != 0) {
                eh0.m11133m("IterableNotification", "No Notification Icon defined - defaulting to app icon");
                identifier = context.getApplicationInfo().icon;
            } else {
                eh0.m11121R("IterableNotification", "No Notification Icon defined - push notifications will not be displayed");
            }
        }
        kc4Var.f65600t.icon = identifier;
        kc4Var.m23424p(string3);
        kc4Var.m23418j(16, true);
        kc4Var.f65585e = vm6.m23410d(string4);
        kc4Var.f65590j = 1;
        kc4Var.m23416h(string5);
        kc4Var.f65591k = true;
        kc4Var.f47024w = string2;
        kc4Var.f47025x = string5;
        kc4Var.f47026y = Math.abs((int) System.currentTimeMillis());
        eh0.m11133m("IterableNotification", "Request code = " + kc4Var.f47026y);
        if (str11 != null) {
            kc4Var.f47026y = Math.abs(str11.hashCode());
            eh0.m11133m("IterableNotification", "Request code = " + kc4Var.f47026y);
        }
        str4 = "com.iterable.push.ACTION_PUSH_ACTION";
        Intent intent4 = new Intent("com.iterable.push.ACTION_PUSH_ACTION");
        intent4.setClass(context, IterableTrampolineActivity.class);
        intent4.putExtras(bundle3);
        str5 = "actionIdentifier";
        intent4.putExtra("actionIdentifier", "default");
        intent4.setFlags(268435456);
        arrayList = mc4Var.f51073f;
        if (arrayList != null) {
            i3 = 0;
            while (r9.hasNext()) {
                intent = new Intent(str4);
                intent.putExtras(bundle3);
                intent.putExtra("requestCode", kc4Var.f47026y);
                intent.putExtra(str5, lc4Var.f49466a);
                intent.putExtra(str5, lc4Var.f49466a);
                str7 = lc4Var.f49468c;
                if (str7.equals("textInput")) {
                    i4 = 167772160;
                } else {
                    i4 = 201326592;
                }
                str8 = str5;
                if (lc4Var.f49469d) {
                    eh0.m11133m("IterableNotification", "Go through TrampolineActivity");
                    intent.setClass(context, IterableTrampolineActivity.class);
                    intent.setFlags(268435456);
                    broadcast = PendingIntent.getActivity(context, intent.hashCode(), intent, i4);
                } else {
                    eh0.m11133m("IterableNotification", "Go through IterablePushActionReceiver");
                    intent.setClass(context, IterablePushActionReceiver.class);
                    broadcast = PendingIntent.getBroadcast(context, intent.hashCode(), intent, i4);
                }
                PendingIntent pendingIntent3 = broadcast;
                String str16 = lc4Var.f49467b;
                Bundle bundle8 = new Bundle();
                CharSequence charSequenceM23410d3 = vm6.m23410d(str16);
                if (str7.equals("textInput")) {
                    j58 j58Var4 = new j58(lc4Var.f49470e, new Bundle(), new HashSet());
                    arrayList2 = new ArrayList();
                    arrayList2.add(j58Var4);
                } else {
                    arrayList2 = null;
                }
                arrayList3 = new ArrayList();
                arrayList4 = new ArrayList();
                if (arrayList2 != null) {
                    while (r2.hasNext()) {
                        j58Var2.getClass();
                        arrayList4.add(j58Var2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList4.isEmpty()) {
                    j58VarArr = null;
                } else {
                    j58VarArr = (j58[]) arrayList4.toArray(new j58[arrayList4.size()]);
                }
                kc4Var.m23412b(new pm6(null, charSequenceM23410d3, pendingIntent3, bundle8, j58VarArr));
                i3++;
                if (i3 == 3) {
                    break;
                    break;
                }
                bundle3 = bundle;
                str4 = str4;
                str5 = str8;
            }
        }
        kc4Var.f65587g = PendingIntent.getActivity(context, kc4Var.f47026y, intent4, 201326592);
        kc4Var.f47023v = lgd.m16185b(bundle);
        if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
            notification2.defaults |= 2;
        }
        i = notification2.defaults;
        notification = kc4Var.f65600t;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
        notificationManager = (NotificationManager) context.getApplicationContext().getSystemService("notification");
        if (notificationManager != null) {
            i2 = 0;
            strM16184a = lgd.m16184a(context, strReplaceFirst, false);
            if (notificationManager.getNotificationChannel(strM16184a) != null) {
                activeNotifications = notificationManager.getActiveNotifications();
                length = activeNotifications.length;
                while (true) {
                    if (i2 >= length) {
                        notificationManager.deleteNotificationChannel(strM16184a);
                        break;
                    }
                    if (activeNotifications[i2].getNotification().getChannelId() == strM16184a) {
                        eh0.m11133m("IterableNotification", "Not Deleting the channel as there are active notification for old channel");
                        break;
                    }
                    i2++;
                }
            }
        }
        notificationManager2 = (NotificationManager) context.getApplicationContext().getSystemService("notification");
        if (notificationManager2 != null) {
            String str17 = str3;
            notificationChannel = notificationManager2.getNotificationChannel(str17);
            if (notificationChannel != null) {
                str6 = str2;
                if (!notificationChannel.getName().equals(str6)) {
                }
            } else {
                str6 = str2;
            }
            eh0.m11133m("IterableNotification", ux5.m22991n("Creating notification: channelId = ", str17, " channelName = ", str6, " channelDescription = "));
            AudioAttributes audioAttributesBuild3 = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
            NotificationChannel notificationChannel4 = new NotificationChannel(str17, str6, 4);
            notificationChannel4.setDescription("");
            notificationChannel4.enableLights(true);
            notificationChannel4.setShowBadge(lgd.m16186c(context));
            notificationChannel4.setSound(uri2, audioAttributesBuild3);
            notificationManager2.createNotificationChannel(notificationChannel4);
        }
        return kc4Var;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m19955b(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(applicationContext.getPackageName());
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m19956c(Bundle bundle) {
        JSONObject jSONObject;
        if (bundle.containsKey("itbl")) {
            try {
                jSONObject = new JSONObject(bundle.getString("itbl"));
            } catch (Exception unused) {
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        return !jSONObject.optString("attachment-url", "").isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m19957d(Bundle bundle) {
        return (bundle.containsKey("itbl") ? bundle.getString("body", "") : "").isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m19958e(Bundle bundle) {
        return lgd.m16185b(bundle);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m19959f(Bundle bundle) {
        return bundle.containsKey("itbl");
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m19960g(HashMap map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: h */
    public static void m19961h(Context context, kc4 kc4Var) {
        if (kc4Var.f47023v) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).notify(kc4Var.f47026y, kc4Var.mo15108c());
    }

    /* JADX INFO: renamed from: i */
    public static Bundle m19962i(Bundle bundle) {
        JSONObject jSONObject;
        if (bundle.containsKey("itbl")) {
            try {
                jSONObject = new JSONObject(bundle.getString("itbl"));
            } catch (Exception unused) {
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return bundle;
        }
        try {
            Bundle bundle2 = new Bundle(bundle);
            jSONObject.remove("attachment-url");
            bundle2.putString("itbl", jSONObject.toString());
            return bundle2;
        } catch (Exception e) {
            eh0.m11136q("IterableNotificationHelper", "Failed to remove push image from bundle", e);
            return bundle;
        }
    }
}
