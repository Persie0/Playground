package bi;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.room.C1185b;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.lingq.entity.Lesson;
import com.lingq.entity.LessonBookmark;
import com.lingq.entity.LessonTag;
import com.lingq.entity.LessonTranslation;
import com.lingq.entity.LessonTransliteration;
import com.lingq.entity.LessonUserCompleted;
import com.lingq.entity.LessonUserLiked;
import com.lingq.entity.MediaSource;
import com.lingq.entity.Sentence;
import com.lingq.entity.SharedByUser;
import com.lingq.entity.SharedByUserAndQueryJoin;
import com.lingq.entity.Shelf;
import com.lingq.entity.TranslationSentence;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import com.lingq.shared.uimodel.lesson.LessonStudyTextToken;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p213k4.AbstractC6583c;
import p213k4.C6595o;
import p288o4.InterfaceC7920f;
import p338qd.C8573r0;
import p367rh.C8798l;
import p367rh.C8799m;
import p367rh.C8800n;
import p367rh.C8801o;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tk.C9312p;

/* JADX INFO: renamed from: bi.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1502p1 extends AbstractC1495o1 {

    /* JADX INFO: renamed from: H */
    public final C0322j f8724H;

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f8725a;

    /* JADX INFO: renamed from: b */
    public final v f8726b;

    /* JADX INFO: renamed from: c */
    public final C1405c0 f8727c = new C1405c0();

    /* JADX INFO: renamed from: d */
    public final C0322j f8728d;

    /* JADX INFO: renamed from: e */
    public final C0322j f8729e;

    /* JADX INFO: renamed from: f */
    public final C0322j f8730f;

    /* JADX INFO: renamed from: g */
    public final C0322j f8731g;

    /* JADX INFO: renamed from: h */
    public final C0322j f8732h;

    /* JADX INFO: renamed from: i */
    public final C0322j f8733i;

    /* JADX INFO: renamed from: j */
    public final C0322j f8734j;

    /* JADX INFO: renamed from: k */
    public final C0322j f8735k;

    /* JADX INFO: renamed from: l */
    public final C0322j f8736l;

    /* JADX INFO: renamed from: bi.p1$a */
    public class a extends AbstractC6583c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonsAndWordsJoin` (`contentId`,`termWithLanguage`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8800n c8800n = (C8800n) obj;
            interfaceC7920f.mo13194W(1, c8800n.f46658a);
            String str = c8800n.f46659b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$a0 */
    public class a0 implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8737a;

        public a0(List list) {
            this.f8737a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            roomDatabase.m4552c();
            try {
                c1502p1.f8729e.m1226n(this.f8737a);
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$b */
    public class b extends AbstractC6583c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonsAndWordsJoin` SET `contentId` = ?,`termWithLanguage` = ? WHERE `contentId` = ? AND `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8800n c8800n = (C8800n) obj;
            interfaceC7920f.mo13194W(1, c8800n.f46658a);
            String str = c8800n.f46659b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8800n.f46658a);
            if (str == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$b0 */
    public class b0 implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8739a;

        public b0(List list) {
            this.f8739a = list;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            roomDatabase.m4552c();
            try {
                c1502p1.f8734j.m1226n(this.f8739a);
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$c */
    public class c extends AbstractC6583c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Shelf` (`codeWithLanguage`,`language`,`pinned`,`tabs`,`code`,`id`,`title`,`order`,`levels`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Shelf shelf = (Shelf) obj;
            String str = shelf.f17425a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = shelf.f17426b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            Boolean bool = shelf.f17427c;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13194W(3, numValueOf.intValue());
            }
            interfaceC7920f.mo13197h0(C1502p1.this.f8727c.m5010u(shelf.f17428d), 4);
            String str3 = shelf.f17429e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            interfaceC7920f.mo13194W(6, shelf.f17430f);
            String str4 = shelf.f17431g;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str4, 7);
            }
            interfaceC7920f.mo13194W(8, shelf.f17432h);
            String str5 = shelf.f17433i;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str5, 9);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$c0 */
    public class c0 implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8742a;

        public c0(List list) {
            this.f8742a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            roomDatabase.m4552c();
            try {
                c1502p1.f8736l.m1226n(this.f8742a);
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$d */
    public class d extends AbstractC6583c {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Shelf` SET `codeWithLanguage` = ?,`language` = ?,`pinned` = ?,`tabs` = ?,`code` = ?,`id` = ?,`title` = ?,`order` = ?,`levels` = ? WHERE `codeWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Shelf shelf = (Shelf) obj;
            String str = shelf.f17425a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = shelf.f17426b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            Boolean bool = shelf.f17427c;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13194W(3, numValueOf.intValue());
            }
            interfaceC7920f.mo13197h0(C1502p1.this.f8727c.m5010u(shelf.f17428d), 4);
            String str3 = shelf.f17429e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            interfaceC7920f.mo13194W(6, shelf.f17430f);
            String str4 = shelf.f17431g;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str4, 7);
            }
            interfaceC7920f.mo13194W(8, shelf.f17432h);
            String str5 = shelf.f17433i;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str5, 9);
            }
            String str6 = shelf.f17425a;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(10);
            } else {
                interfaceC7920f.mo13197h0(str6, 10);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$d0 */
    public class d0 extends SharedSQLiteStatement {
        public d0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE LessonAudioDownload SET isDownloaded = 1 WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: bi.p1$e */
    public class e extends AbstractC6583c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonBookmark` (`contentId`,`wordIndex`,`client`,`timestamp`,`languageTimestamp`) VALUES (?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LessonBookmark lessonBookmark = (LessonBookmark) obj;
            interfaceC7920f.mo13194W(1, lessonBookmark.f17143a);
            Integer num = lessonBookmark.f17144b;
            if (num == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13194W(2, num.intValue());
            }
            String str = lessonBookmark.f17145c;
            if (str == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str, 3);
            }
            String str2 = lessonBookmark.f17146d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
            String str3 = lessonBookmark.f17147e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$e0 */
    public class e0 implements Callable<Lesson> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8745a;

        public e0(C6595o c6595o) {
            this.f8745a = c6595o;
        }

        /* JADX WARN: Code duplicated, block: B:254:0x0735 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:256:0x073d  */
        /* JADX WARN: Code duplicated, block: B:257:0x073e  */
        /* JADX WARN: Code duplicated, block: B:258:0x0743  */
        /* JADX WARN: Code duplicated, block: B:261:0x074b  */
        /* JADX WARN: Code duplicated, block: B:262:0x074e A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:265:0x0758  */
        /* JADX WARN: Code duplicated, block: B:266:0x075b A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:268:0x0765 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:269:0x076f  */
        /* JADX WARN: Code duplicated, block: B:273:0x0780 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:275:0x0788  */
        /* JADX WARN: Code duplicated, block: B:276:0x0789  */
        /* JADX WARN: Code duplicated, block: B:277:0x078e  */
        /* JADX WARN: Code duplicated, block: B:280:0x0796  */
        /* JADX WARN: Code duplicated, block: B:281:0x0799 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:284:0x07a3  */
        /* JADX WARN: Code duplicated, block: B:285:0x07a6 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:289:0x07bd A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:291:0x07c5 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:295:0x07cf  */
        /* JADX WARN: Code duplicated, block: B:298:0x07d7  */
        /* JADX WARN: Code duplicated, block: B:299:0x07da A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:302:0x07e4  */
        /* JADX WARN: Code duplicated, block: B:303:0x07e7 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        /* JADX WARN: Code duplicated, block: B:306:0x07f1  */
        /* JADX WARN: Code duplicated, block: B:307:0x07f2 A[Catch: all -> 0x0721, TryCatch #0 {all -> 0x0721, blocks: (B:5:0x005e, B:7:0x0284, B:11:0x0297, B:15:0x02a6, B:19:0x02b9, B:23:0x02c8, B:27:0x02d7, B:31:0x02e6, B:35:0x02f5, B:39:0x0308, B:43:0x0317, B:47:0x0326, B:51:0x035d, B:55:0x036e, B:59:0x0381, B:63:0x039a, B:67:0x03b1, B:71:0x03c8, B:75:0x03e1, B:79:0x03fa, B:83:0x040f, B:87:0x0420, B:91:0x043b, B:95:0x0446, B:99:0x045b, B:103:0x046e, B:107:0x0481, B:111:0x0494, B:115:0x04b1, B:119:0x04c4, B:123:0x04d7, B:127:0x04ea, B:131:0x04fd, B:135:0x0510, B:139:0x0523, B:143:0x0536, B:147:0x0549, B:151:0x0554, B:155:0x0561, B:159:0x056e, B:163:0x057b, B:167:0x059c, B:171:0x05a9, B:175:0x05cc, B:179:0x05d9, B:183:0x0610, B:187:0x0623, B:191:0x0636, B:202:0x065f, B:206:0x067e, B:217:0x06a7, B:221:0x06b4, B:231:0x06e1, B:233:0x06e7, B:238:0x06f7, B:242:0x0704, B:247:0x0717, B:251:0x0726, B:252:0x072f, B:254:0x0735, B:259:0x0745, B:263:0x0752, B:268:0x0765, B:270:0x0771, B:271:0x077a, B:273:0x0780, B:278:0x0790, B:282:0x079d, B:286:0x07aa, B:287:0x07b7, B:289:0x07bd, B:291:0x07c5, B:309:0x07ff, B:296:0x07d1, B:300:0x07de, B:304:0x07eb, B:308:0x07f6, B:307:0x07f2, B:303:0x07e7, B:299:0x07da, B:285:0x07a6, B:281:0x0799, B:266:0x075b, B:262:0x074e, B:245:0x070d, B:241:0x0700, B:227:0x06d2, B:230:0x06d9, B:224:0x06c3, B:220:0x06b0, B:212:0x0696, B:216:0x069f, B:209:0x0687, B:205:0x0676, B:197:0x064e, B:201:0x0657, B:194:0x063f, B:190:0x062e, B:186:0x061b, B:182:0x0608, B:178:0x05d5, B:174:0x05c0, B:170:0x05a5, B:166:0x0594, B:146:0x0541, B:142:0x052e, B:138:0x051b, B:134:0x0508, B:130:0x04f5, B:126:0x04e2, B:122:0x04cf, B:118:0x04bc, B:114:0x04a5, B:110:0x048c, B:106:0x0479, B:102:0x0466, B:98:0x0453, B:90:0x0433, B:82:0x0407, B:70:0x03bc, B:66:0x03a5, B:62:0x0392, B:58:0x037d, B:54:0x0368, B:50:0x0355, B:46:0x0320, B:42:0x0311, B:38:0x0302, B:34:0x02ef, B:30:0x02e0, B:26:0x02d1, B:22:0x02c2, B:18:0x02b3, B:14:0x02a0, B:10:0x0291), top: B:316:0x005e }] */
        @Override // java.util.concurrent.Callable
        public final Lesson call() throws Exception {
            C6595o c6595o;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            int i10;
            LessonUserLiked lessonUserLiked;
            int i11;
            LessonUserCompleted lessonUserCompleted;
            int i12;
            LessonTranslation lessonTranslation;
            int i13;
            String string;
            String string2;
            MediaSource mediaSource;
            String string3;
            String string4;
            String string5;
            Long lValueOf;
            Date date;
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C1405c0 c1405c0 = c1502p1.f8727c;
            C6595o c6595o2 = this.f8745a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o2);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "type");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "url");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "pos");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "title");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "description");
                int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "pubDate");
                int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "imageUrl");
                int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "audioUrl");
                int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "duration");
                int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "status");
                int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "sharedDate");
                int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "originalUrl");
                c6595o = c6595o2;
                try {
                    int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "wordCount");
                    int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "uniqueWordCount");
                    int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "rosesCount");
                    int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "lessonRating");
                    int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "audioRating");
                    int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "collectionId");
                    int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "collectionTitle");
                    int iM16742n20 = C8573r0.m16742n0(cursorM16698S0, "transliteration");
                    int iM16742n21 = C8573r0.m16742n0(cursorM16698S0, "altScript");
                    int iM16742n22 = C8573r0.m16742n0(cursorM16698S0, "classicUrl");
                    int iM16742n23 = C8573r0.m16742n0(cursorM16698S0, "previousLessonId");
                    int iM16742n24 = C8573r0.m16742n0(cursorM16698S0, "nextLessonId");
                    int iM16742n25 = C8573r0.m16742n0(cursorM16698S0, "readTimes");
                    int iM16742n26 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
                    int iM16742n27 = C8573r0.m16742n0(cursorM16698S0, "isCompleted");
                    int iM16742n28 = C8573r0.m16742n0(cursorM16698S0, "newWordsCount");
                    int iM16742n29 = C8573r0.m16742n0(cursorM16698S0, "cardsCount");
                    int iM16742n30 = C8573r0.m16742n0(cursorM16698S0, "isRoseGiven");
                    int iM16742n31 = C8573r0.m16742n0(cursorM16698S0, "giveRoseUrl");
                    int iM16742n32 = C8573r0.m16742n0(cursorM16698S0, "price");
                    int iM16742n33 = C8573r0.m16742n0(cursorM16698S0, "opened");
                    int iM16742n34 = C8573r0.m16742n0(cursorM16698S0, "percentCompleted");
                    int iM16742n35 = C8573r0.m16742n0(cursorM16698S0, "lastRoseReceived");
                    int iM16742n36 = C8573r0.m16742n0(cursorM16698S0, "isFavorite");
                    int iM16742n37 = C8573r0.m16742n0(cursorM16698S0, "printUrl");
                    int iM16742n38 = C8573r0.m16742n0(cursorM16698S0, "videoUrl");
                    int iM16742n39 = C8573r0.m16742n0(cursorM16698S0, "exercises");
                    int iM16742n40 = C8573r0.m16742n0(cursorM16698S0, "notes");
                    int iM16742n41 = C8573r0.m16742n0(cursorM16698S0, "viewsCount");
                    int iM16742n42 = C8573r0.m16742n0(cursorM16698S0, "providerId");
                    int iM16742n43 = C8573r0.m16742n0(cursorM16698S0, "providerName");
                    int iM16742n44 = C8573r0.m16742n0(cursorM16698S0, "providerDescription");
                    int iM16742n45 = C8573r0.m16742n0(cursorM16698S0, "originalImageUrl");
                    int iM16742n46 = C8573r0.m16742n0(cursorM16698S0, "providerImageUrl");
                    int iM16742n47 = C8573r0.m16742n0(cursorM16698S0, "sharedById");
                    int iM16742n48 = C8573r0.m16742n0(cursorM16698S0, "sharedByName");
                    int iM16742n49 = C8573r0.m16742n0(cursorM16698S0, "sharedByImageUrl");
                    int iM16742n50 = C8573r0.m16742n0(cursorM16698S0, "sharedByRole");
                    int iM16742n51 = C8573r0.m16742n0(cursorM16698S0, "isSharedByIsFriend");
                    int iM16742n52 = C8573r0.m16742n0(cursorM16698S0, "isCanEdit");
                    int iM16742n53 = C8573r0.m16742n0(cursorM16698S0, "canEditSentence");
                    int iM16742n54 = C8573r0.m16742n0(cursorM16698S0, "isProtected");
                    int iM16742n55 = C8573r0.m16742n0(cursorM16698S0, "lessonVotes");
                    int iM16742n56 = C8573r0.m16742n0(cursorM16698S0, "audioVotes");
                    int iM16742n57 = C8573r0.m16742n0(cursorM16698S0, "level");
                    int iM16742n58 = C8573r0.m16742n0(cursorM16698S0, "tags");
                    int iM16742n59 = C8573r0.m16742n0(cursorM16698S0, "progressDownloaded");
                    int iM16742n60 = C8573r0.m16742n0(cursorM16698S0, "progress");
                    int iM16742n61 = C8573r0.m16742n0(cursorM16698S0, "translationSentence");
                    int iM16742n62 = C8573r0.m16742n0(cursorM16698S0, "mediaImageUrl");
                    int iM16742n63 = C8573r0.m16742n0(cursorM16698S0, "mediaTitle");
                    int iM16742n64 = C8573r0.m16742n0(cursorM16698S0, "ptime");
                    int iM16742n65 = C8573r0.m16742n0(cursorM16698S0, "isPinned");
                    int iM16742n66 = C8573r0.m16742n0(cursorM16698S0, "difficulty");
                    int iM16742n67 = C8573r0.m16742n0(cursorM16698S0, "newWords");
                    int iM16742n68 = C8573r0.m16742n0(cursorM16698S0, "lessonPreview");
                    int iM16742n69 = C8573r0.m16742n0(cursorM16698S0, "isTaken");
                    int iM16742n70 = C8573r0.m16742n0(cursorM16698S0, "folders");
                    int iM16742n71 = C8573r0.m16742n0(cursorM16698S0, "audioPending");
                    int iM16742n72 = C8573r0.m16742n0(cursorM16698S0, "userLiked_username");
                    int iM16742n73 = C8573r0.m16742n0(cursorM16698S0, "userLiked_liked");
                    int iM16742n74 = C8573r0.m16742n0(cursorM16698S0, "userCompleted_username");
                    int iM16742n75 = C8573r0.m16742n0(cursorM16698S0, "userCompleted_completed");
                    int iM16742n76 = C8573r0.m16742n0(cursorM16698S0, "translation_language");
                    int iM16742n77 = C8573r0.m16742n0(cursorM16698S0, "translation_sentences");
                    int iM16742n78 = C8573r0.m16742n0(cursorM16698S0, "source_type");
                    int iM16742n79 = C8573r0.m16742n0(cursorM16698S0, "source_name");
                    int iM16742n80 = C8573r0.m16742n0(cursorM16698S0, "source_url");
                    Lesson lesson = null;
                    String string6 = null;
                    if (cursorM16698S0.moveToFirst()) {
                        int i14 = cursorM16698S0.getInt(iM16742n0);
                        String string7 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                        String string8 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                        int i15 = cursorM16698S0.getInt(iM16742n3);
                        String string9 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                        String string10 = cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5);
                        String string11 = cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6);
                        String string12 = cursorM16698S0.isNull(iM16742n7) ? null : cursorM16698S0.getString(iM16742n7);
                        String string13 = cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8);
                        int i16 = cursorM16698S0.getInt(iM16742n9);
                        String string14 = cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10);
                        String string15 = cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11);
                        String string16 = cursorM16698S0.isNull(iM16742n12) ? null : cursorM16698S0.getString(iM16742n12);
                        int i17 = cursorM16698S0.getInt(iM16742n13);
                        int i18 = cursorM16698S0.getInt(iM16742n14);
                        int i19 = cursorM16698S0.getInt(iM16742n15);
                        double d10 = cursorM16698S0.getDouble(iM16742n16);
                        double d11 = cursorM16698S0.getDouble(iM16742n17);
                        int i20 = cursorM16698S0.getInt(iM16742n18);
                        String string17 = cursorM16698S0.isNull(iM16742n19) ? null : cursorM16698S0.getString(iM16742n19);
                        List<LessonTransliteration> listM5000j = r17.m5000j(cursorM16698S0.isNull(r24) ? null : cursorM16698S0.getString(iM16742n20));
                        List<LessonTransliteration> listM5000j2 = r17.m5000j(cursorM16698S0.isNull(iM16742n21) ? null : cursorM16698S0.getString(iM16742n21));
                        String string18 = cursorM16698S0.isNull(iM16742n22) ? null : cursorM16698S0.getString(iM16742n22);
                        Integer numValueOf = cursorM16698S0.isNull(r27) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n23));
                        Integer numValueOf2 = cursorM16698S0.isNull(r28) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n24));
                        double d12 = cursorM16698S0.getDouble(iM16742n25);
                        double d13 = cursorM16698S0.getDouble(iM16742n26);
                        boolean z10 = cursorM16698S0.getInt(iM16742n27) != 0;
                        int i21 = cursorM16698S0.getInt(iM16742n28);
                        int i22 = cursorM16698S0.getInt(iM16742n29);
                        boolean z11 = cursorM16698S0.getInt(iM16742n30) != 0;
                        String string19 = cursorM16698S0.isNull(iM16742n31) ? null : cursorM16698S0.getString(iM16742n31);
                        int i23 = cursorM16698S0.getInt(iM16742n32);
                        boolean z12 = cursorM16698S0.getInt(iM16742n33) != 0;
                        double d14 = cursorM16698S0.getDouble(iM16742n34);
                        String string20 = cursorM16698S0.isNull(iM16742n35) ? null : cursorM16698S0.getString(iM16742n35);
                        boolean z13 = cursorM16698S0.getInt(iM16742n36) != 0;
                        String string21 = cursorM16698S0.isNull(iM16742n37) ? null : cursorM16698S0.getString(iM16742n37);
                        String string22 = cursorM16698S0.isNull(r42) ? null : cursorM16698S0.getString(iM16742n38);
                        String string23 = cursorM16698S0.isNull(r43) ? null : cursorM16698S0.getString(iM16742n39);
                        String string24 = cursorM16698S0.isNull(r44) ? null : cursorM16698S0.getString(iM16742n40);
                        int i24 = cursorM16698S0.getInt(iM16742n41);
                        Integer numValueOf3 = cursorM16698S0.isNull(iM16742n42) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n42));
                        String string25 = cursorM16698S0.isNull(r47) ? null : cursorM16698S0.getString(iM16742n43);
                        String string26 = cursorM16698S0.isNull(r48) ? null : cursorM16698S0.getString(iM16742n44);
                        String string27 = cursorM16698S0.isNull(r49) ? null : cursorM16698S0.getString(iM16742n45);
                        String string28 = cursorM16698S0.isNull(r50) ? null : cursorM16698S0.getString(iM16742n46);
                        String string29 = cursorM16698S0.isNull(r51) ? null : cursorM16698S0.getString(iM16742n47);
                        String string30 = cursorM16698S0.isNull(r52) ? null : cursorM16698S0.getString(iM16742n48);
                        String string31 = cursorM16698S0.isNull(r53) ? null : cursorM16698S0.getString(iM16742n49);
                        String string32 = cursorM16698S0.isNull(r54) ? null : cursorM16698S0.getString(iM16742n50);
                        boolean z14 = cursorM16698S0.getInt(iM16742n51) != 0;
                        boolean z15 = cursorM16698S0.getInt(iM16742n52) != 0;
                        boolean z16 = cursorM16698S0.getInt(iM16742n53) != 0;
                        boolean z17 = cursorM16698S0.getInt(iM16742n54) != 0;
                        int i25 = cursorM16698S0.getInt(iM16742n55);
                        int i26 = cursorM16698S0.getInt(iM16742n56);
                        String string33 = cursorM16698S0.isNull(iM16742n57) ? null : cursorM16698S0.getString(iM16742n57);
                        List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(r62) ? null : cursorM16698S0.getString(iM16742n58));
                        int i27 = cursorM16698S0.getInt(iM16742n59);
                        Float fValueOf = cursorM16698S0.isNull(iM16742n60) ? null : Float.valueOf(cursorM16698S0.getFloat(iM16742n60));
                        String string34 = cursorM16698S0.isNull(r65) ? null : cursorM16698S0.getString(iM16742n61);
                        C5207g.m11111f(string34, "data");
                        Object objM10532b = c1405c0.f8356a.m10564b(C9312p.m17659d(List.class, TranslationSentence.class)).m10532b(string34);
                        C5207g.m11108c(objM10532b);
                        List list = (List) objM10532b;
                        String string35 = cursorM16698S0.isNull(iM16742n62) ? null : cursorM16698S0.getString(iM16742n62);
                        String string36 = cursorM16698S0.isNull(r67) ? null : cursorM16698S0.getString(iM16742n63);
                        String string37 = cursorM16698S0.isNull(r68) ? null : cursorM16698S0.getString(iM16742n64);
                        Integer numValueOf4 = cursorM16698S0.isNull(r69) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n65));
                        if (numValueOf4 == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                        }
                        double d15 = cursorM16698S0.getDouble(iM16742n66);
                        int i28 = cursorM16698S0.getInt(iM16742n67);
                        String string38 = cursorM16698S0.isNull(iM16742n68) ? null : cursorM16698S0.getString(iM16742n68);
                        Integer numValueOf5 = cursorM16698S0.isNull(r73) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n69));
                        if (numValueOf5 == null) {
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf5.intValue() != 0);
                        }
                        List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(r74) ? null : cursorM16698S0.getString(iM16742n70));
                        Integer numValueOf6 = cursorM16698S0.isNull(iM16742n71) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n71));
                        if (numValueOf6 == null) {
                            boolValueOf3 = null;
                        } else {
                            boolValueOf3 = Boolean.valueOf(numValueOf6.intValue() != 0);
                        }
                        if (cursorM16698S0.isNull(r76)) {
                            i10 = iM16742n73;
                            if (cursorM16698S0.isNull(i10)) {
                                lessonUserLiked = null;
                            }
                            if (cursorM16698S0.isNull(r78)) {
                                i11 = iM16742n75;
                                if (!cursorM16698S0.isNull(i11)) {
                                    lessonUserCompleted = null;
                                }
                                if (cursorM16698S0.isNull(r80)) {
                                    i12 = iM16742n77;
                                    if (!cursorM16698S0.isNull(i12)) {
                                        lessonTranslation = null;
                                    }
                                    if (cursorM16698S0.isNull(r82)) {
                                        i13 = iM16742n79;
                                        if (!cursorM16698S0.isNull(i13) && cursorM16698S0.isNull(iM16742n80)) {
                                            mediaSource = null;
                                        }
                                        lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                                    } else {
                                        i13 = iM16742n79;
                                    }
                                    if (cursorM16698S0.isNull(r82)) {
                                        string = null;
                                    } else {
                                        string = cursorM16698S0.getString(iM16742n78);
                                    }
                                    if (cursorM16698S0.isNull(i13)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorM16698S0.getString(i13);
                                    }
                                    if (cursorM16698S0.isNull(iM16742n80)) {
                                        string6 = cursorM16698S0.getString(iM16742n80);
                                    }
                                    mediaSource = new MediaSource(string, string2, string6);
                                    lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                                } else {
                                    i12 = iM16742n77;
                                }
                                if (cursorM16698S0.isNull(r80)) {
                                    string3 = null;
                                } else {
                                    string3 = cursorM16698S0.getString(iM16742n76);
                                }
                                if (cursorM16698S0.isNull(i12)) {
                                    string4 = null;
                                } else {
                                    string4 = cursorM16698S0.getString(i12);
                                }
                                lessonTranslation = new LessonTranslation(C1405c0.m4992l(string4), string3);
                                if (cursorM16698S0.isNull(r82)) {
                                    i13 = iM16742n79;
                                    if (!cursorM16698S0.isNull(i13)) {
                                    }
                                    lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                                } else {
                                    i13 = iM16742n79;
                                }
                                if (cursorM16698S0.isNull(r82)) {
                                    string = null;
                                } else {
                                    string = cursorM16698S0.getString(iM16742n78);
                                }
                                if (cursorM16698S0.isNull(i13)) {
                                    string2 = null;
                                } else {
                                    string2 = cursorM16698S0.getString(i13);
                                }
                                if (cursorM16698S0.isNull(iM16742n80)) {
                                    string6 = cursorM16698S0.getString(iM16742n80);
                                }
                                mediaSource = new MediaSource(string, string2, string6);
                                lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                            } else {
                                i11 = iM16742n75;
                            }
                            if (cursorM16698S0.isNull(r78)) {
                                string5 = null;
                            } else {
                                string5 = cursorM16698S0.getString(iM16742n74);
                            }
                            if (cursorM16698S0.isNull(i11)) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(cursorM16698S0.getLong(i11));
                            }
                            if (lValueOf != null) {
                                date = new Date(lValueOf.longValue());
                            } else {
                                date = null;
                            }
                            lessonUserCompleted = new LessonUserCompleted(string5, date);
                            if (cursorM16698S0.isNull(r80)) {
                                i12 = iM16742n77;
                                if (!cursorM16698S0.isNull(i12)) {
                                    lessonTranslation = null;
                                }
                                if (cursorM16698S0.isNull(r82)) {
                                    i13 = iM16742n79;
                                    if (!cursorM16698S0.isNull(i13)) {
                                    }
                                    lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                                } else {
                                    i13 = iM16742n79;
                                }
                                if (cursorM16698S0.isNull(r82)) {
                                    string = null;
                                } else {
                                    string = cursorM16698S0.getString(iM16742n78);
                                }
                                if (cursorM16698S0.isNull(i13)) {
                                    string2 = null;
                                } else {
                                    string2 = cursorM16698S0.getString(i13);
                                }
                                if (cursorM16698S0.isNull(iM16742n80)) {
                                    string6 = cursorM16698S0.getString(iM16742n80);
                                }
                                mediaSource = new MediaSource(string, string2, string6);
                                lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                            } else {
                                i12 = iM16742n77;
                            }
                            if (cursorM16698S0.isNull(r80)) {
                                string3 = null;
                            } else {
                                string3 = cursorM16698S0.getString(iM16742n76);
                            }
                            if (cursorM16698S0.isNull(i12)) {
                                string4 = null;
                            } else {
                                string4 = cursorM16698S0.getString(i12);
                            }
                            lessonTranslation = new LessonTranslation(C1405c0.m4992l(string4), string3);
                            if (cursorM16698S0.isNull(r82)) {
                                i13 = iM16742n79;
                                if (!cursorM16698S0.isNull(i13)) {
                                }
                                lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                            } else {
                                i13 = iM16742n79;
                            }
                            if (cursorM16698S0.isNull(r82)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(iM16742n78);
                            }
                            if (cursorM16698S0.isNull(i13)) {
                                string2 = null;
                            } else {
                                string2 = cursorM16698S0.getString(i13);
                            }
                            if (cursorM16698S0.isNull(iM16742n80)) {
                                string6 = cursorM16698S0.getString(iM16742n80);
                            }
                            mediaSource = new MediaSource(string, string2, string6);
                            lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                        } else {
                            i10 = iM16742n73;
                        }
                        String string39 = cursorM16698S0.isNull(r76) ? null : cursorM16698S0.getString(iM16742n72);
                        Long lValueOf2 = cursorM16698S0.isNull(i10) ? null : Long.valueOf(cursorM16698S0.getLong(i10));
                        lessonUserLiked = new LessonUserLiked(string39, lValueOf2 != null ? new Date(lValueOf2.longValue()) : null);
                        if (cursorM16698S0.isNull(r78)) {
                            i11 = iM16742n75;
                            if (!cursorM16698S0.isNull(i11)) {
                                lessonUserCompleted = null;
                            }
                            if (cursorM16698S0.isNull(r80)) {
                                i12 = iM16742n77;
                                if (!cursorM16698S0.isNull(i12)) {
                                    lessonTranslation = null;
                                }
                                if (cursorM16698S0.isNull(r82)) {
                                    i13 = iM16742n79;
                                    if (!cursorM16698S0.isNull(i13)) {
                                    }
                                    lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                                } else {
                                    i13 = iM16742n79;
                                }
                                if (cursorM16698S0.isNull(r82)) {
                                    string = null;
                                } else {
                                    string = cursorM16698S0.getString(iM16742n78);
                                }
                                if (cursorM16698S0.isNull(i13)) {
                                    string2 = null;
                                } else {
                                    string2 = cursorM16698S0.getString(i13);
                                }
                                if (cursorM16698S0.isNull(iM16742n80)) {
                                    string6 = cursorM16698S0.getString(iM16742n80);
                                }
                                mediaSource = new MediaSource(string, string2, string6);
                                lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                            } else {
                                i12 = iM16742n77;
                            }
                            if (cursorM16698S0.isNull(r80)) {
                                string3 = null;
                            } else {
                                string3 = cursorM16698S0.getString(iM16742n76);
                            }
                            if (cursorM16698S0.isNull(i12)) {
                                string4 = null;
                            } else {
                                string4 = cursorM16698S0.getString(i12);
                            }
                            lessonTranslation = new LessonTranslation(C1405c0.m4992l(string4), string3);
                            if (cursorM16698S0.isNull(r82)) {
                                i13 = iM16742n79;
                                if (!cursorM16698S0.isNull(i13)) {
                                }
                                lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                            } else {
                                i13 = iM16742n79;
                            }
                            if (cursorM16698S0.isNull(r82)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(iM16742n78);
                            }
                            if (cursorM16698S0.isNull(i13)) {
                                string2 = null;
                            } else {
                                string2 = cursorM16698S0.getString(i13);
                            }
                            if (cursorM16698S0.isNull(iM16742n80)) {
                                string6 = cursorM16698S0.getString(iM16742n80);
                            }
                            mediaSource = new MediaSource(string, string2, string6);
                            lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                        } else {
                            i11 = iM16742n75;
                        }
                        if (cursorM16698S0.isNull(r78)) {
                            string5 = null;
                        } else {
                            string5 = cursorM16698S0.getString(iM16742n74);
                        }
                        if (cursorM16698S0.isNull(i11)) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorM16698S0.getLong(i11));
                        }
                        if (lValueOf != null) {
                            date = new Date(lValueOf.longValue());
                        } else {
                            date = null;
                        }
                        lessonUserCompleted = new LessonUserCompleted(string5, date);
                        if (cursorM16698S0.isNull(r80)) {
                            i12 = iM16742n77;
                            if (!cursorM16698S0.isNull(i12)) {
                                lessonTranslation = null;
                            }
                            if (cursorM16698S0.isNull(r82)) {
                                i13 = iM16742n79;
                                if (!cursorM16698S0.isNull(i13)) {
                                }
                                lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                            } else {
                                i13 = iM16742n79;
                            }
                            if (cursorM16698S0.isNull(r82)) {
                                string = null;
                            } else {
                                string = cursorM16698S0.getString(iM16742n78);
                            }
                            if (cursorM16698S0.isNull(i13)) {
                                string2 = null;
                            } else {
                                string2 = cursorM16698S0.getString(i13);
                            }
                            if (cursorM16698S0.isNull(iM16742n80)) {
                                string6 = cursorM16698S0.getString(iM16742n80);
                            }
                            mediaSource = new MediaSource(string, string2, string6);
                            lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                        } else {
                            i12 = iM16742n77;
                        }
                        if (cursorM16698S0.isNull(r80)) {
                            string3 = null;
                        } else {
                            string3 = cursorM16698S0.getString(iM16742n76);
                        }
                        if (cursorM16698S0.isNull(i12)) {
                            string4 = null;
                        } else {
                            string4 = cursorM16698S0.getString(i12);
                        }
                        lessonTranslation = new LessonTranslation(C1405c0.m4992l(string4), string3);
                        if (cursorM16698S0.isNull(r82)) {
                            i13 = iM16742n79;
                            if (!cursorM16698S0.isNull(i13)) {
                            }
                            lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                        } else {
                            i13 = iM16742n79;
                        }
                        if (cursorM16698S0.isNull(r82)) {
                            string = null;
                        } else {
                            string = cursorM16698S0.getString(iM16742n78);
                        }
                        if (cursorM16698S0.isNull(i13)) {
                            string2 = null;
                        } else {
                            string2 = cursorM16698S0.getString(i13);
                        }
                        if (cursorM16698S0.isNull(iM16742n80)) {
                            string6 = cursorM16698S0.getString(iM16742n80);
                        }
                        mediaSource = new MediaSource(string, string2, string6);
                        lesson = new Lesson(i14, string7, string8, i15, string9, string10, string11, string12, string13, i16, string14, string15, string16, i17, i18, i19, d10, d11, i20, string17, lessonUserLiked, lessonUserCompleted, lessonTranslation, listM5000j, listM5000j2, string18, mediaSource, numValueOf, numValueOf2, d12, d13, z10, i21, i22, z11, string19, i23, z12, d14, string20, z13, string21, string22, string23, string24, i24, numValueOf3, string25, string26, string27, string28, string29, string30, string31, string32, z14, z15, z16, z17, i25, i26, string33, listM4992l, i27, fValueOf, list, string35, string36, string37, boolValueOf, d15, i28, string38, boolValueOf2, listM4992l2, boolValueOf3);
                    }
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    return lesson;
                } catch (Throwable th2) {
                    th = th2;
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6595o = c6595o2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$f */
    public class f extends AbstractC6583c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonBookmark` SET `contentId` = ?,`wordIndex` = ?,`client` = ?,`timestamp` = ?,`languageTimestamp` = ? WHERE `contentId` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LessonBookmark lessonBookmark = (LessonBookmark) obj;
            interfaceC7920f.mo13194W(1, lessonBookmark.f17143a);
            Integer num = lessonBookmark.f17144b;
            if (num == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13194W(2, num.intValue());
            }
            String str = lessonBookmark.f17145c;
            if (str == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str, 3);
            }
            String str2 = lessonBookmark.f17146d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
            String str3 = lessonBookmark.f17147e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            interfaceC7920f.mo13194W(6, lessonBookmark.f17143a);
        }
    }

    /* JADX INFO: renamed from: bi.p1$f0 */
    public class f0 implements Callable<LessonStudy> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8747a;

        public f0(C6595o c6595o) {
            this.f8747a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final LessonStudy call() throws Exception {
            LessonStudy lessonStudy;
            Boolean boolValueOf;
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C6595o c6595o = this.f8747a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                if (cursorM16698S0.moveToFirst()) {
                    int i10 = cursorM16698S0.getInt(0);
                    String string = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    String string3 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    String string4 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                    int i11 = cursorM16698S0.getInt(5);
                    int i12 = cursorM16698S0.getInt(6);
                    String string5 = cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7);
                    Integer numValueOf = cursorM16698S0.isNull(8) ? null : Integer.valueOf(cursorM16698S0.getInt(8));
                    Integer numValueOf2 = cursorM16698S0.isNull(9) ? null : Integer.valueOf(cursorM16698S0.getInt(9));
                    boolean z10 = cursorM16698S0.getInt(10) != 0;
                    int i13 = cursorM16698S0.getInt(11);
                    int i14 = cursorM16698S0.getInt(12);
                    String string6 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                    String string7 = cursorM16698S0.isNull(14) ? null : cursorM16698S0.getString(14);
                    String string8 = cursorM16698S0.isNull(15) ? null : cursorM16698S0.getString(15);
                    boolean z11 = cursorM16698S0.getInt(16) != 0;
                    boolean z12 = cursorM16698S0.getInt(17) != 0;
                    String string9 = cursorM16698S0.isNull(18) ? null : cursorM16698S0.getString(18);
                    int i15 = cursorM16698S0.getInt(19);
                    String string10 = cursorM16698S0.isNull(20) ? null : cursorM16698S0.getString(20);
                    C1405c0 c1405c0 = c1502p1.f8727c;
                    c1405c0.getClass();
                    C5207g.m11111f(string10, "data");
                    Object objM10532b = c1405c0.f8356a.m10564b(C9312p.m17659d(List.class, LessonStudyTranslationSentence.class)).m10532b(string10);
                    C5207g.m11108c(objM10532b);
                    List list = (List) objM10532b;
                    String string11 = cursorM16698S0.isNull(21) ? null : cursorM16698S0.getString(21);
                    String string12 = cursorM16698S0.isNull(22) ? null : cursorM16698S0.getString(22);
                    Integer numValueOf3 = cursorM16698S0.isNull(23) ? null : Integer.valueOf(cursorM16698S0.getInt(23));
                    if (numValueOf3 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf3.intValue() != 0);
                    }
                    lessonStudy = new LessonStudy(i10, string, string2, string7, string3, string4, i11, i12, string5, null, numValueOf, numValueOf2, z10, i15, list, string11, string12, string9, i13, boolValueOf, string6, cursorM16698S0.getInt(24) != 0, string8, z12, z11, i14);
                } else {
                    lessonStudy = null;
                }
                return lessonStudy;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$g */
    public class g extends AbstractC6583c {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `TranslationSentence` (`index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations`) VALUES (?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            TranslationSentence translationSentence = (TranslationSentence) obj;
            interfaceC7920f.mo13194W(1, translationSentence.f17533a);
            interfaceC7920f.mo13194W(2, translationSentence.f17534b);
            Double d10 = translationSentence.f17535c;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 3);
            }
            Double d11 = translationSentence.f17536d;
            if (d11 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13192F0(d11.doubleValue(), 4);
            }
            String str = translationSentence.f17537e;
            if (str == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str, 5);
            }
            interfaceC7920f.mo13197h0(C1502p1.this.f8727c.m5013x(translationSentence.f17538f), 6);
        }
    }

    /* JADX INFO: renamed from: bi.p1$g0 */
    public class g0 implements Callable<LessonInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8750a;

        public g0(C6595o c6595o) {
            this.f8750a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final LessonInfo call() throws Exception {
            LessonInfo lessonInfo;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string;
            int i10;
            LessonMediaSource lessonMediaSource;
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C6595o c6595o = this.f8750a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                if (cursorM16698S0.moveToFirst()) {
                    int i11 = cursorM16698S0.getInt(0);
                    String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    String string4 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    String string5 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                    String string6 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                    int i12 = cursorM16698S0.getInt(6);
                    String string7 = cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7);
                    String string8 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                    Integer numValueOf = cursorM16698S0.isNull(9) ? null : Integer.valueOf(cursorM16698S0.getInt(9));
                    Integer numValueOf2 = cursorM16698S0.isNull(10) ? null : Integer.valueOf(cursorM16698S0.getInt(10));
                    int i13 = cursorM16698S0.getInt(11);
                    int i14 = cursorM16698S0.getInt(12);
                    String string9 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                    Integer numValueOf3 = cursorM16698S0.isNull(14) ? null : Integer.valueOf(cursorM16698S0.getInt(14));
                    Integer numValueOf4 = cursorM16698S0.isNull(15) ? null : Integer.valueOf(cursorM16698S0.getInt(15));
                    Integer numValueOf5 = cursorM16698S0.isNull(16) ? null : Integer.valueOf(cursorM16698S0.getInt(16));
                    if (numValueOf5 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf5.intValue() != 0);
                    }
                    int i15 = cursorM16698S0.getInt(17);
                    int i16 = cursorM16698S0.getInt(18);
                    Integer numValueOf6 = cursorM16698S0.isNull(19) ? null : Integer.valueOf(cursorM16698S0.getInt(19));
                    if (numValueOf6 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf6.intValue() != 0);
                    }
                    String string10 = cursorM16698S0.isNull(20) ? null : cursorM16698S0.getString(20);
                    int i17 = cursorM16698S0.getInt(21);
                    String string11 = cursorM16698S0.isNull(22) ? null : cursorM16698S0.getString(22);
                    Integer numValueOf7 = cursorM16698S0.isNull(23) ? null : Integer.valueOf(cursorM16698S0.getInt(23));
                    String string12 = cursorM16698S0.isNull(24) ? null : cursorM16698S0.getString(24);
                    String string13 = cursorM16698S0.isNull(25) ? null : cursorM16698S0.getString(25);
                    String string14 = cursorM16698S0.isNull(26) ? null : cursorM16698S0.getString(26);
                    String string15 = cursorM16698S0.isNull(27) ? null : cursorM16698S0.getString(27);
                    String string16 = cursorM16698S0.isNull(28) ? null : cursorM16698S0.getString(28);
                    String string17 = cursorM16698S0.isNull(29) ? null : cursorM16698S0.getString(29);
                    String string18 = cursorM16698S0.isNull(30) ? null : cursorM16698S0.getString(30);
                    String string19 = cursorM16698S0.isNull(31) ? null : cursorM16698S0.getString(31);
                    Integer numValueOf8 = cursorM16698S0.isNull(32) ? null : Integer.valueOf(cursorM16698S0.getInt(32));
                    if (numValueOf8 == null) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(numValueOf8.intValue() != 0);
                    }
                    String string20 = cursorM16698S0.isNull(33) ? null : cursorM16698S0.getString(33);
                    String string21 = cursorM16698S0.isNull(34) ? null : cursorM16698S0.getString(34);
                    c1502p1.f8727c.getClass();
                    List listM4992l = C1405c0.m4992l(string21);
                    String string22 = cursorM16698S0.isNull(35) ? null : cursorM16698S0.getString(35);
                    String string23 = cursorM16698S0.isNull(36) ? null : cursorM16698S0.getString(36);
                    Integer numValueOf9 = cursorM16698S0.isNull(37) ? null : Integer.valueOf(cursorM16698S0.getInt(37));
                    String string24 = cursorM16698S0.isNull(38) ? null : cursorM16698S0.getString(38);
                    if (cursorM16698S0.isNull(39) && cursorM16698S0.isNull(40) && cursorM16698S0.isNull(41)) {
                        cursorM16698S0 = cursorM16698S0;
                        c6595o = c6595o;
                        lessonMediaSource = null;
                    } else {
                        if (cursorM16698S0.isNull(39)) {
                            i10 = 40;
                            string = null;
                        } else {
                            string = cursorM16698S0.getString(39);
                            i10 = 40;
                        }
                        try {
                            try {
                                lessonMediaSource = new LessonMediaSource(string, cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10), cursorM16698S0.isNull(41) ? null : cursorM16698S0.getString(41));
                            } catch (Throwable th2) {
                                th = th2;
                                cursorM16698S0.close();
                                c6595o.m13198q();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursorM16698S0 = cursorM16698S0;
                            cursorM16698S0.close();
                            c6595o.m13198q();
                            throw th;
                        }
                    }
                    lessonInfo = new LessonInfo(i11, string3, string4, string5, string6, string7, i12, i14, string9, numValueOf3, numValueOf4, boolValueOf, string22, string23, numValueOf, numValueOf2, i13, i15, i16, boolValueOf2, string10, numValueOf9, numValueOf7, string12, string13, string14, string15, string16, string17, string18, string19, boolValueOf3, listM4992l, string24, string2, string20, lessonMediaSource, i17, string8, string11);
                } else {
                    cursorM16698S0 = cursorM16698S0;
                    c6595o = c6595o;
                    lessonInfo = null;
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return lessonInfo;
            } catch (Throwable th4) {
                th = th4;
                cursorM16698S0 = cursorM16698S0;
                c6595o = c6595o;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$h */
    public class h extends AbstractC6583c {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `TranslationSentence` SET `index` = ?,`lessonId` = ?,`audio` = ?,`audioEnd` = ?,`text` = ?,`translations` = ? WHERE `index` = ? AND `lessonId` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            TranslationSentence translationSentence = (TranslationSentence) obj;
            interfaceC7920f.mo13194W(1, translationSentence.f17533a);
            long j10 = translationSentence.f17534b;
            interfaceC7920f.mo13194W(2, j10);
            Double d10 = translationSentence.f17535c;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 3);
            }
            Double d11 = translationSentence.f17536d;
            if (d11 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13192F0(d11.doubleValue(), 4);
            }
            String str = translationSentence.f17537e;
            if (str == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str, 5);
            }
            interfaceC7920f.mo13197h0(C1502p1.this.f8727c.m5013x(translationSentence.f17538f), 6);
            interfaceC7920f.mo13194W(7, translationSentence.f17533a);
            interfaceC7920f.mo13194W(8, j10);
        }
    }

    /* JADX INFO: renamed from: bi.p1$h0 */
    public class h0 implements Callable<LessonStudyBookmark> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8753a;

        public h0(C6595o c6595o) {
            this.f8753a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final LessonStudyBookmark call() throws Exception {
            RoomDatabase roomDatabase = C1502p1.this.f8725a;
            C6595o c6595o = this.f8753a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                String str = null;
                LessonStudyBookmark lessonStudyBookmark = str;
                if (cursorM16698S0.moveToFirst()) {
                    lessonStudyBookmark = new LessonStudyBookmark(cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.isNull(0) ? null : Integer.valueOf(cursorM16698S0.getInt(0)), cursorM16698S0.isNull(3) ? str : cursorM16698S0.getString(3));
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return lessonStudyBookmark;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$i */
    public class i extends AbstractC6583c {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonsWithPlaylistJoin` (`playlistId`,`contentId`,`language`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8801o c8801o = (C8801o) obj;
            interfaceC7920f.mo13194W(1, c8801o.f46660a);
            interfaceC7920f.mo13194W(2, c8801o.f46661b);
            String str = c8801o.f46662c;
            if (str == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str, 3);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$i0 */
    public class i0 implements Callable<List<LessonStudySentence>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8755a;

        public i0(C6595o c6595o) {
            this.f8755a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<LessonStudySentence> call() throws Exception {
            C6595o c6595o = this.f8755a;
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C1405c0 c1405c0 = c1502p1.f8727c;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        String string = null;
                        List<LessonStudyTextToken> listM5003n = c1405c0.m5003n(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0));
                        String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                        String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                        int i10 = cursorM16698S0.getInt(3);
                        if (!cursorM16698S0.isNull(4)) {
                            string = cursorM16698S0.getString(4);
                        }
                        arrayList.add(new LessonStudySentence(i10, string2, string3, listM5003n, c1405c0.m4999i(string), cursorM16698S0.getInt(5) != 0));
                    }
                    roomDatabase.m4568s();
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    roomDatabase.m4563n();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th2;
                }
            } catch (Throwable th3) {
                roomDatabase.m4563n();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$j */
    public class j extends AbstractC6583c {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonsWithPlaylistJoin` SET `playlistId` = ?,`contentId` = ?,`language` = ? WHERE `playlistId` = ? AND `contentId` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8801o c8801o = (C8801o) obj;
            interfaceC7920f.mo13194W(1, c8801o.f46660a);
            long j10 = c8801o.f46661b;
            interfaceC7920f.mo13194W(2, j10);
            String str = c8801o.f46662c;
            if (str == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str, 3);
            }
            interfaceC7920f.mo13194W(4, c8801o.f46660a);
            interfaceC7920f.mo13194W(5, j10);
        }
    }

    /* JADX INFO: renamed from: bi.p1$j0 */
    public class j0 extends SharedSQLiteStatement {
        public j0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE Lesson SET title = ? WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: bi.p1$k */
    public class k extends AbstractC6583c {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM `Lesson` WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            interfaceC7920f.mo13194W(1, ((Lesson) obj).f17093a);
        }
    }

    /* JADX INFO: renamed from: bi.p1$k0 */
    public class k0 implements Callable<LessonStudySentence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8757a;

        public k0(C6595o c6595o) {
            this.f8757a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final LessonStudySentence call() throws Exception {
            C6595o c6595o = this.f8757a;
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C1405c0 c1405c0 = c1502p1.f8727c;
            roomDatabase.m4552c();
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
                try {
                    String str = null;
                    LessonStudySentence lessonStudySentence = str;
                    if (cursorM16698S0.moveToFirst()) {
                        lessonStudySentence = new LessonStudySentence(cursorM16698S0.getInt(3), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), c1405c0.m5003n(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0)), c1405c0.m4999i(cursorM16698S0.isNull(4) ? str : cursorM16698S0.getString(4)), cursorM16698S0.getInt(5) != 0);
                    }
                    roomDatabase.m4568s();
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    roomDatabase.m4563n();
                    return lessonStudySentence;
                } catch (Throwable th2) {
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th2;
                }
            } catch (Throwable th3) {
                roomDatabase.m4563n();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$l */
    public class l extends AbstractC6583c {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Sentence` (`lessonId`,`tokens`,`text`,`normalizedText`,`index`,`timestamp`,`startParagraph`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Sentence sentence = (Sentence) obj;
            interfaceC7920f.mo13194W(1, sentence.f17394a);
            C1502p1 c1502p1 = C1502p1.this;
            interfaceC7920f.mo13197h0(c1502p1.f8727c.m5011v(sentence.f17395b), 2);
            String str = sentence.f17396c;
            if (str == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str, 3);
            }
            String str2 = sentence.f17397d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
            interfaceC7920f.mo13194W(5, sentence.f17398e);
            interfaceC7920f.mo13197h0(c1502p1.f8727c.m4993b(sentence.f17399f), 6);
            interfaceC7920f.mo13194W(7, sentence.f17400g ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: bi.p1$l0 */
    public class l0 implements Callable<LessonStudySentence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8760a;

        public l0(C6595o c6595o) {
            this.f8760a = c6595o;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final LessonStudySentence call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C1405c0 c1405c0 = c1502p1.f8727c;
            C6595o c6595o = this.f8760a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                LessonStudySentence lessonStudySentence = null;
                String string = null;
                if (cursorM16698S0.moveToFirst()) {
                    List<LessonStudyTextToken> listM5003n = c1405c0.m5003n(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0));
                    String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    int i10 = cursorM16698S0.getInt(3);
                    if (!cursorM16698S0.isNull(4)) {
                        string = cursorM16698S0.getString(4);
                    }
                    lessonStudySentence = new LessonStudySentence(i10, string2, string3, listM5003n, c1405c0.m4999i(string), cursorM16698S0.getInt(5) != 0);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return lessonStudySentence;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$m */
    public class m extends AbstractC6583c {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Sentence` SET `lessonId` = ?,`tokens` = ?,`text` = ?,`normalizedText` = ?,`index` = ?,`timestamp` = ?,`startParagraph` = ? WHERE `lessonId` = ? AND `index` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Sentence sentence = (Sentence) obj;
            interfaceC7920f.mo13194W(1, sentence.f17394a);
            C1502p1 c1502p1 = C1502p1.this;
            interfaceC7920f.mo13197h0(c1502p1.f8727c.m5011v(sentence.f17395b), 2);
            String str = sentence.f17396c;
            if (str == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str, 3);
            }
            String str2 = sentence.f17397d;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str2, 4);
            }
            long j10 = sentence.f17398e;
            interfaceC7920f.mo13194W(5, j10);
            interfaceC7920f.mo13197h0(c1502p1.f8727c.m4993b(sentence.f17399f), 6);
            interfaceC7920f.mo13194W(7, sentence.f17400g ? 1L : 0L);
            interfaceC7920f.mo13194W(8, sentence.f17394a);
            interfaceC7920f.mo13194W(9, j10);
        }
    }

    /* JADX INFO: renamed from: bi.p1$m0 */
    public class m0 implements Callable<LessonStudySentence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8763a;

        public m0(C6595o c6595o) {
            this.f8763a = c6595o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final LessonStudySentence call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C1405c0 c1405c0 = c1502p1.f8727c;
            C6595o c6595o = this.f8763a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                String str = null;
                LessonStudySentence lessonStudySentence = str;
                if (cursorM16698S0.moveToFirst()) {
                    lessonStudySentence = new LessonStudySentence(cursorM16698S0.getInt(3), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), c1405c0.m5003n(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0)), c1405c0.m4999i(cursorM16698S0.isNull(4) ? str : cursorM16698S0.getString(4)), cursorM16698S0.getInt(5) != 0);
                }
                cursorM16698S0.close();
                c6595o.m13198q();
                return lessonStudySentence;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$n */
    public class n extends AbstractC6583c {
        public n(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonAudioDownload` (`id`,`language`,`isDownloaded`,`downloadProgress`) VALUES (?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8798l c8798l = (C8798l) obj;
            interfaceC7920f.mo13194W(1, c8798l.f46652a);
            String str = c8798l.f46653b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8798l.f46654c ? 1L : 0L);
            interfaceC7920f.mo13194W(4, c8798l.f46655d);
        }
    }

    /* JADX INFO: renamed from: bi.p1$n0 */
    public class n0 implements Callable<List<LessonStudyTranslationSentence>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6595o f8765a;

        public n0(C6595o c6595o) {
            this.f8765a = c6595o;
        }

        @Override // java.util.concurrent.Callable
        public final List<LessonStudyTranslationSentence> call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            C6595o c6595o = this.f8765a;
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "index");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "lessonId");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "audio");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "audioEnd");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "text");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "translations");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    int i10 = cursorM16698S0.getInt(iM16742n0);
                    int i11 = cursorM16698S0.getInt(iM16742n1);
                    String string = null;
                    Double dValueOf = cursorM16698S0.isNull(iM16742n2) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n2));
                    Double dValueOf2 = cursorM16698S0.isNull(iM16742n3) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n3));
                    String string2 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                    if (!cursorM16698S0.isNull(iM16742n5)) {
                        string = cursorM16698S0.getString(iM16742n5);
                    }
                    arrayList.add(new LessonStudyTranslationSentence(i10, i11, dValueOf, dValueOf2, string2, c1502p1.f8727c.m5004o(string)));
                }
                return arrayList;
            } finally {
                cursorM16698S0.close();
                c6595o.m13198q();
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$o */
    public class o extends AbstractC6583c {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonAudioDownload` SET `id` = ?,`language` = ?,`isDownloaded` = ?,`downloadProgress` = ? WHERE `id` = ? AND `language` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8798l c8798l = (C8798l) obj;
            interfaceC7920f.mo13194W(1, c8798l.f46652a);
            String str = c8798l.f46653b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8798l.f46654c ? 1L : 0L);
            interfaceC7920f.mo13194W(4, c8798l.f46655d);
            interfaceC7920f.mo13194W(5, c8798l.f46652a);
            if (str == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str, 6);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$o0 */
    public class o0 extends AbstractC6583c {
        public o0(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `Lesson` (`id`,`type`,`url`,`pos`,`title`,`description`,`pubDate`,`imageUrl`,`audioUrl`,`duration`,`status`,`sharedDate`,`originalUrl`,`wordCount`,`uniqueWordCount`,`rosesCount`,`lessonRating`,`audioRating`,`collectionId`,`collectionTitle`,`transliteration`,`altScript`,`classicUrl`,`previousLessonId`,`nextLessonId`,`readTimes`,`listenTimes`,`isCompleted`,`newWordsCount`,`cardsCount`,`isRoseGiven`,`giveRoseUrl`,`price`,`opened`,`percentCompleted`,`lastRoseReceived`,`isFavorite`,`printUrl`,`videoUrl`,`exercises`,`notes`,`viewsCount`,`providerId`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedById`,`sharedByName`,`sharedByImageUrl`,`sharedByRole`,`isSharedByIsFriend`,`isCanEdit`,`canEditSentence`,`isProtected`,`lessonVotes`,`audioVotes`,`level`,`tags`,`progressDownloaded`,`progress`,`translationSentence`,`mediaImageUrl`,`mediaTitle`,`ptime`,`isPinned`,`difficulty`,`newWords`,`lessonPreview`,`isTaken`,`folders`,`audioPending`,`userLiked_username`,`userLiked_liked`,`userCompleted_username`,`userCompleted_completed`,`translation_language`,`translation_sentences`,`source_type`,`source_name`,`source_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Lesson lesson = (Lesson) obj;
            interfaceC7920f.mo13194W(1, lesson.f17093a);
            String str = lesson.f17095b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = lesson.f17097c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, lesson.f17099d);
            String str3 = lesson.f17101e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            String str4 = lesson.f17103f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = lesson.f17105g;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
            String str6 = lesson.f17107h;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str6, 8);
            }
            String str7 = lesson.f17109i;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str7, 9);
            }
            interfaceC7920f.mo13194W(10, lesson.f17111j);
            String str8 = lesson.f17113k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = lesson.f17115l;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = lesson.f17117m;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
            interfaceC7920f.mo13194W(14, lesson.f17119n);
            interfaceC7920f.mo13194W(15, lesson.f17121o);
            interfaceC7920f.mo13194W(16, lesson.f17123p);
            interfaceC7920f.mo13192F0(lesson.f17125q, 17);
            interfaceC7920f.mo13192F0(lesson.f17127r, 18);
            interfaceC7920f.mo13194W(19, lesson.f17129s);
            String str11 = lesson.f17131t;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str11, 20);
            }
            C1502p1 c1502p1 = C1502p1.this;
            interfaceC7920f.mo13197h0(c1502p1.f8727c.m4994c(lesson.f17139x), 21);
            C1405c0 c1405c0 = c1502p1.f8727c;
            interfaceC7920f.mo13197h0(c1405c0.m4994c(lesson.f17141y), 22);
            String str12 = lesson.f17142z;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(23);
            } else {
                interfaceC7920f.mo13197h0(str12, 23);
            }
            Integer num = lesson.f17068B;
            if (num == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13194W(24, num.intValue());
            }
            Integer num2 = lesson.f17069C;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13194W(25, num2.intValue());
            }
            interfaceC7920f.mo13192F0(lesson.f17070D, 26);
            interfaceC7920f.mo13192F0(lesson.f17071E, 27);
            interfaceC7920f.mo13194W(28, lesson.f17072F ? 1L : 0L);
            interfaceC7920f.mo13194W(29, lesson.f17073G);
            interfaceC7920f.mo13194W(30, lesson.f17074H);
            interfaceC7920f.mo13194W(31, lesson.f17075I ? 1L : 0L);
            String str13 = lesson.f17076J;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(32);
            } else {
                interfaceC7920f.mo13197h0(str13, 32);
            }
            interfaceC7920f.mo13194W(33, lesson.f17077K);
            interfaceC7920f.mo13194W(34, lesson.f17078L ? 1L : 0L);
            interfaceC7920f.mo13192F0(lesson.f17079M, 35);
            String str14 = lesson.f17080N;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(36);
            } else {
                interfaceC7920f.mo13197h0(str14, 36);
            }
            interfaceC7920f.mo13194W(37, lesson.f17081O ? 1L : 0L);
            String str15 = lesson.f17082P;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(38);
            } else {
                interfaceC7920f.mo13197h0(str15, 38);
            }
            String str16 = lesson.f17083Q;
            if (str16 == null) {
                interfaceC7920f.mo13193J0(39);
            } else {
                interfaceC7920f.mo13197h0(str16, 39);
            }
            String str17 = lesson.f17084R;
            if (str17 == null) {
                interfaceC7920f.mo13193J0(40);
            } else {
                interfaceC7920f.mo13197h0(str17, 40);
            }
            String str18 = lesson.f17085S;
            if (str18 == null) {
                interfaceC7920f.mo13193J0(41);
            } else {
                interfaceC7920f.mo13197h0(str18, 41);
            }
            interfaceC7920f.mo13194W(42, lesson.f17086T);
            Integer num3 = lesson.f17087U;
            if (num3 == null) {
                interfaceC7920f.mo13193J0(43);
            } else {
                interfaceC7920f.mo13194W(43, num3.intValue());
            }
            String str19 = lesson.f17088V;
            if (str19 == null) {
                interfaceC7920f.mo13193J0(44);
            } else {
                interfaceC7920f.mo13197h0(str19, 44);
            }
            String str20 = lesson.f17089W;
            if (str20 == null) {
                interfaceC7920f.mo13193J0(45);
            } else {
                interfaceC7920f.mo13197h0(str20, 45);
            }
            String str21 = lesson.f17090X;
            if (str21 == null) {
                interfaceC7920f.mo13193J0(46);
            } else {
                interfaceC7920f.mo13197h0(str21, 46);
            }
            String str22 = lesson.f17091Y;
            if (str22 == null) {
                interfaceC7920f.mo13193J0(47);
            } else {
                interfaceC7920f.mo13197h0(str22, 47);
            }
            String str23 = lesson.f17092Z;
            if (str23 == null) {
                interfaceC7920f.mo13193J0(48);
            } else {
                interfaceC7920f.mo13197h0(str23, 48);
            }
            String str24 = lesson.f17094a0;
            if (str24 == null) {
                interfaceC7920f.mo13193J0(49);
            } else {
                interfaceC7920f.mo13197h0(str24, 49);
            }
            String str25 = lesson.f17096b0;
            if (str25 == null) {
                interfaceC7920f.mo13193J0(50);
            } else {
                interfaceC7920f.mo13197h0(str25, 50);
            }
            String str26 = lesson.f17098c0;
            if (str26 == null) {
                interfaceC7920f.mo13193J0(51);
            } else {
                interfaceC7920f.mo13197h0(str26, 51);
            }
            interfaceC7920f.mo13194W(52, lesson.f17100d0 ? 1L : 0L);
            interfaceC7920f.mo13194W(53, lesson.f17102e0 ? 1L : 0L);
            interfaceC7920f.mo13194W(54, lesson.f17104f0 ? 1L : 0L);
            interfaceC7920f.mo13194W(55, lesson.f17106g0 ? 1L : 0L);
            interfaceC7920f.mo13194W(56, lesson.f17108h0);
            interfaceC7920f.mo13194W(57, lesson.f17110i0);
            String str27 = lesson.f17112j0;
            if (str27 == null) {
                interfaceC7920f.mo13193J0(58);
            } else {
                interfaceC7920f.mo13197h0(str27, 58);
            }
            String strM4991d = C1405c0.m4991d(lesson.f17114k0);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(59);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 59);
            }
            interfaceC7920f.mo13194W(60, lesson.f17116l0);
            Float f3 = lesson.f17118m0;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(61);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 61);
            }
            interfaceC7920f.mo13197h0(c1405c0.m4997g(lesson.f17120n0), 62);
            String str28 = lesson.f17122o0;
            if (str28 == null) {
                interfaceC7920f.mo13193J0(63);
            } else {
                interfaceC7920f.mo13197h0(str28, 63);
            }
            String str29 = lesson.f17124p0;
            if (str29 == null) {
                interfaceC7920f.mo13193J0(64);
            } else {
                interfaceC7920f.mo13197h0(str29, 64);
            }
            String str30 = lesson.f17126q0;
            if (str30 == null) {
                interfaceC7920f.mo13193J0(65);
            } else {
                interfaceC7920f.mo13197h0(str30, 65);
            }
            Integer numValueOf = null;
            Boolean bool = lesson.f17128r0;
            Integer numValueOf2 = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf2 == null) {
                interfaceC7920f.mo13193J0(66);
            } else {
                interfaceC7920f.mo13194W(66, numValueOf2.intValue());
            }
            interfaceC7920f.mo13192F0(lesson.f17130s0, 67);
            interfaceC7920f.mo13194W(68, lesson.f17132t0);
            String str31 = lesson.f17134u0;
            if (str31 == null) {
                interfaceC7920f.mo13193J0(69);
            } else {
                interfaceC7920f.mo13197h0(str31, 69);
            }
            Boolean bool2 = lesson.f17136v0;
            Integer numValueOf3 = bool2 == null ? null : Integer.valueOf(bool2.booleanValue() ? 1 : 0);
            if (numValueOf3 == null) {
                interfaceC7920f.mo13193J0(70);
            } else {
                interfaceC7920f.mo13194W(70, numValueOf3.intValue());
            }
            String strM4991d2 = C1405c0.m4991d(lesson.f17138w0);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(71);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 71);
            }
            Boolean bool3 = lesson.f17140x0;
            if (bool3 != null) {
                numValueOf = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
            }
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(72);
            } else {
                interfaceC7920f.mo13194W(72, numValueOf.intValue());
            }
            LessonUserLiked lessonUserLiked = lesson.f17133u;
            if (lessonUserLiked != null) {
                String str32 = lessonUserLiked.f17194a;
                if (str32 == null) {
                    interfaceC7920f.mo13193J0(73);
                } else {
                    interfaceC7920f.mo13197h0(str32, 73);
                }
                Long lM4990a = C1405c0.m4990a(lessonUserLiked.f17195b);
                if (lM4990a == null) {
                    interfaceC7920f.mo13193J0(74);
                } else {
                    interfaceC7920f.mo13194W(74, lM4990a.longValue());
                }
            } else {
                interfaceC7920f.mo13193J0(73);
                interfaceC7920f.mo13193J0(74);
            }
            LessonUserCompleted lessonUserCompleted = lesson.f17135v;
            if (lessonUserCompleted != null) {
                String str33 = lessonUserCompleted.f17188a;
                if (str33 == null) {
                    interfaceC7920f.mo13193J0(75);
                } else {
                    interfaceC7920f.mo13197h0(str33, 75);
                }
                Long lM4990a2 = C1405c0.m4990a(lessonUserCompleted.f17189b);
                if (lM4990a2 == null) {
                    interfaceC7920f.mo13193J0(76);
                } else {
                    interfaceC7920f.mo13194W(76, lM4990a2.longValue());
                }
            } else {
                interfaceC7920f.mo13193J0(75);
                interfaceC7920f.mo13193J0(76);
            }
            LessonTranslation lessonTranslation = lesson.f17137w;
            if (lessonTranslation != null) {
                String str34 = lessonTranslation.f17173a;
                if (str34 == null) {
                    interfaceC7920f.mo13193J0(77);
                } else {
                    interfaceC7920f.mo13197h0(str34, 77);
                }
                String strM4991d3 = C1405c0.m4991d(lessonTranslation.f17174b);
                if (strM4991d3 == null) {
                    interfaceC7920f.mo13193J0(78);
                } else {
                    interfaceC7920f.mo13197h0(strM4991d3, 78);
                }
            } else {
                interfaceC7920f.mo13193J0(77);
                interfaceC7920f.mo13193J0(78);
            }
            MediaSource mediaSource = lesson.f17067A;
            if (mediaSource == null) {
                interfaceC7920f.mo13193J0(79);
                interfaceC7920f.mo13193J0(80);
                interfaceC7920f.mo13193J0(81);
                return;
            }
            String str35 = mediaSource.f17293a;
            if (str35 == null) {
                interfaceC7920f.mo13193J0(79);
            } else {
                interfaceC7920f.mo13197h0(str35, 79);
            }
            String str36 = mediaSource.f17294b;
            if (str36 == null) {
                interfaceC7920f.mo13193J0(80);
            } else {
                interfaceC7920f.mo13197h0(str36, 80);
            }
            String str37 = mediaSource.f17295c;
            if (str37 == null) {
                interfaceC7920f.mo13193J0(81);
            } else {
                interfaceC7920f.mo13197h0(str37, 81);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$p */
    public class p extends AbstractC6583c {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonTag` (`title`) VALUES (?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            String str = ((LessonTag) obj).f17170a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$p0 */
    public class p0 implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8768a;

        public p0(List list) {
            this.f8768a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            StringBuilder sbM771r = C0166e.m771r("UPDATE Lesson SET isTaken = 1 WHERE id IN (");
            List<Integer> list = this.f8768a;
            C5206f.m11021s0(list.size(), sbM771r);
            sbM771r.append(")");
            String string = sbM771r.toString();
            C1502p1 c1502p1 = C1502p1.this;
            InterfaceC7920f interfaceC7920fM4555f = c1502p1.f8725a.m4555f(string);
            int i10 = 1;
            for (Integer num : list) {
                if (num == null) {
                    interfaceC7920fM4555f.mo13193J0(i10);
                } else {
                    interfaceC7920fM4555f.mo13194W(i10, num.intValue());
                }
                i10++;
            }
            RoomDatabase roomDatabase = c1502p1.f8725a;
            roomDatabase.m4552c();
            try {
                interfaceC7920fM4555f.mo15736A();
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$q */
    public class q extends AbstractC6583c {
        public q(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonTag` SET `title` = ? WHERE `title` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            LessonTag lessonTag = (LessonTag) obj;
            String str = lessonTag.f17170a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = lessonTag.f17170a;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$q0 */
    public class q0 extends AbstractC6583c {
        public q0(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `Lesson` SET `id` = ?,`type` = ?,`url` = ?,`pos` = ?,`title` = ?,`description` = ?,`pubDate` = ?,`imageUrl` = ?,`audioUrl` = ?,`duration` = ?,`status` = ?,`sharedDate` = ?,`originalUrl` = ?,`wordCount` = ?,`uniqueWordCount` = ?,`rosesCount` = ?,`lessonRating` = ?,`audioRating` = ?,`collectionId` = ?,`collectionTitle` = ?,`transliteration` = ?,`altScript` = ?,`classicUrl` = ?,`previousLessonId` = ?,`nextLessonId` = ?,`readTimes` = ?,`listenTimes` = ?,`isCompleted` = ?,`newWordsCount` = ?,`cardsCount` = ?,`isRoseGiven` = ?,`giveRoseUrl` = ?,`price` = ?,`opened` = ?,`percentCompleted` = ?,`lastRoseReceived` = ?,`isFavorite` = ?,`printUrl` = ?,`videoUrl` = ?,`exercises` = ?,`notes` = ?,`viewsCount` = ?,`providerId` = ?,`providerName` = ?,`providerDescription` = ?,`originalImageUrl` = ?,`providerImageUrl` = ?,`sharedById` = ?,`sharedByName` = ?,`sharedByImageUrl` = ?,`sharedByRole` = ?,`isSharedByIsFriend` = ?,`isCanEdit` = ?,`canEditSentence` = ?,`isProtected` = ?,`lessonVotes` = ?,`audioVotes` = ?,`level` = ?,`tags` = ?,`progressDownloaded` = ?,`progress` = ?,`translationSentence` = ?,`mediaImageUrl` = ?,`mediaTitle` = ?,`ptime` = ?,`isPinned` = ?,`difficulty` = ?,`newWords` = ?,`lessonPreview` = ?,`isTaken` = ?,`folders` = ?,`audioPending` = ?,`userLiked_username` = ?,`userLiked_liked` = ?,`userCompleted_username` = ?,`userCompleted_completed` = ?,`translation_language` = ?,`translation_sentences` = ?,`source_type` = ?,`source_name` = ?,`source_url` = ? WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            Lesson lesson = (Lesson) obj;
            interfaceC7920f.mo13194W(1, lesson.f17093a);
            String str = lesson.f17095b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = lesson.f17097c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            interfaceC7920f.mo13194W(4, lesson.f17099d);
            String str3 = lesson.f17101e;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str3, 5);
            }
            String str4 = lesson.f17103f;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str4, 6);
            }
            String str5 = lesson.f17105g;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str5, 7);
            }
            String str6 = lesson.f17107h;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(8);
            } else {
                interfaceC7920f.mo13197h0(str6, 8);
            }
            String str7 = lesson.f17109i;
            if (str7 == null) {
                interfaceC7920f.mo13193J0(9);
            } else {
                interfaceC7920f.mo13197h0(str7, 9);
            }
            interfaceC7920f.mo13194W(10, lesson.f17111j);
            String str8 = lesson.f17113k;
            if (str8 == null) {
                interfaceC7920f.mo13193J0(11);
            } else {
                interfaceC7920f.mo13197h0(str8, 11);
            }
            String str9 = lesson.f17115l;
            if (str9 == null) {
                interfaceC7920f.mo13193J0(12);
            } else {
                interfaceC7920f.mo13197h0(str9, 12);
            }
            String str10 = lesson.f17117m;
            if (str10 == null) {
                interfaceC7920f.mo13193J0(13);
            } else {
                interfaceC7920f.mo13197h0(str10, 13);
            }
            interfaceC7920f.mo13194W(14, lesson.f17119n);
            interfaceC7920f.mo13194W(15, lesson.f17121o);
            interfaceC7920f.mo13194W(16, lesson.f17123p);
            interfaceC7920f.mo13192F0(lesson.f17125q, 17);
            interfaceC7920f.mo13192F0(lesson.f17127r, 18);
            interfaceC7920f.mo13194W(19, lesson.f17129s);
            String str11 = lesson.f17131t;
            if (str11 == null) {
                interfaceC7920f.mo13193J0(20);
            } else {
                interfaceC7920f.mo13197h0(str11, 20);
            }
            C1502p1 c1502p1 = C1502p1.this;
            interfaceC7920f.mo13197h0(c1502p1.f8727c.m4994c(lesson.f17139x), 21);
            C1405c0 c1405c0 = c1502p1.f8727c;
            interfaceC7920f.mo13197h0(c1405c0.m4994c(lesson.f17141y), 22);
            String str12 = lesson.f17142z;
            if (str12 == null) {
                interfaceC7920f.mo13193J0(23);
            } else {
                interfaceC7920f.mo13197h0(str12, 23);
            }
            Integer num = lesson.f17068B;
            if (num == null) {
                interfaceC7920f.mo13193J0(24);
            } else {
                interfaceC7920f.mo13194W(24, num.intValue());
            }
            Integer num2 = lesson.f17069C;
            if (num2 == null) {
                interfaceC7920f.mo13193J0(25);
            } else {
                interfaceC7920f.mo13194W(25, num2.intValue());
            }
            interfaceC7920f.mo13192F0(lesson.f17070D, 26);
            interfaceC7920f.mo13192F0(lesson.f17071E, 27);
            interfaceC7920f.mo13194W(28, lesson.f17072F ? 1L : 0L);
            interfaceC7920f.mo13194W(29, lesson.f17073G);
            interfaceC7920f.mo13194W(30, lesson.f17074H);
            interfaceC7920f.mo13194W(31, lesson.f17075I ? 1L : 0L);
            String str13 = lesson.f17076J;
            if (str13 == null) {
                interfaceC7920f.mo13193J0(32);
            } else {
                interfaceC7920f.mo13197h0(str13, 32);
            }
            interfaceC7920f.mo13194W(33, lesson.f17077K);
            interfaceC7920f.mo13194W(34, lesson.f17078L ? 1L : 0L);
            interfaceC7920f.mo13192F0(lesson.f17079M, 35);
            String str14 = lesson.f17080N;
            if (str14 == null) {
                interfaceC7920f.mo13193J0(36);
            } else {
                interfaceC7920f.mo13197h0(str14, 36);
            }
            interfaceC7920f.mo13194W(37, lesson.f17081O ? 1L : 0L);
            String str15 = lesson.f17082P;
            if (str15 == null) {
                interfaceC7920f.mo13193J0(38);
            } else {
                interfaceC7920f.mo13197h0(str15, 38);
            }
            String str16 = lesson.f17083Q;
            if (str16 == null) {
                interfaceC7920f.mo13193J0(39);
            } else {
                interfaceC7920f.mo13197h0(str16, 39);
            }
            String str17 = lesson.f17084R;
            if (str17 == null) {
                interfaceC7920f.mo13193J0(40);
            } else {
                interfaceC7920f.mo13197h0(str17, 40);
            }
            String str18 = lesson.f17085S;
            if (str18 == null) {
                interfaceC7920f.mo13193J0(41);
            } else {
                interfaceC7920f.mo13197h0(str18, 41);
            }
            interfaceC7920f.mo13194W(42, lesson.f17086T);
            Integer num3 = lesson.f17087U;
            if (num3 == null) {
                interfaceC7920f.mo13193J0(43);
            } else {
                interfaceC7920f.mo13194W(43, num3.intValue());
            }
            String str19 = lesson.f17088V;
            if (str19 == null) {
                interfaceC7920f.mo13193J0(44);
            } else {
                interfaceC7920f.mo13197h0(str19, 44);
            }
            String str20 = lesson.f17089W;
            if (str20 == null) {
                interfaceC7920f.mo13193J0(45);
            } else {
                interfaceC7920f.mo13197h0(str20, 45);
            }
            String str21 = lesson.f17090X;
            if (str21 == null) {
                interfaceC7920f.mo13193J0(46);
            } else {
                interfaceC7920f.mo13197h0(str21, 46);
            }
            String str22 = lesson.f17091Y;
            if (str22 == null) {
                interfaceC7920f.mo13193J0(47);
            } else {
                interfaceC7920f.mo13197h0(str22, 47);
            }
            String str23 = lesson.f17092Z;
            if (str23 == null) {
                interfaceC7920f.mo13193J0(48);
            } else {
                interfaceC7920f.mo13197h0(str23, 48);
            }
            String str24 = lesson.f17094a0;
            if (str24 == null) {
                interfaceC7920f.mo13193J0(49);
            } else {
                interfaceC7920f.mo13197h0(str24, 49);
            }
            String str25 = lesson.f17096b0;
            if (str25 == null) {
                interfaceC7920f.mo13193J0(50);
            } else {
                interfaceC7920f.mo13197h0(str25, 50);
            }
            String str26 = lesson.f17098c0;
            if (str26 == null) {
                interfaceC7920f.mo13193J0(51);
            } else {
                interfaceC7920f.mo13197h0(str26, 51);
            }
            interfaceC7920f.mo13194W(52, lesson.f17100d0 ? 1L : 0L);
            interfaceC7920f.mo13194W(53, lesson.f17102e0 ? 1L : 0L);
            interfaceC7920f.mo13194W(54, lesson.f17104f0 ? 1L : 0L);
            interfaceC7920f.mo13194W(55, lesson.f17106g0 ? 1L : 0L);
            interfaceC7920f.mo13194W(56, lesson.f17108h0);
            interfaceC7920f.mo13194W(57, lesson.f17110i0);
            String str27 = lesson.f17112j0;
            if (str27 == null) {
                interfaceC7920f.mo13193J0(58);
            } else {
                interfaceC7920f.mo13197h0(str27, 58);
            }
            String strM4991d = C1405c0.m4991d(lesson.f17114k0);
            if (strM4991d == null) {
                interfaceC7920f.mo13193J0(59);
            } else {
                interfaceC7920f.mo13197h0(strM4991d, 59);
            }
            interfaceC7920f.mo13194W(60, lesson.f17116l0);
            Float f3 = lesson.f17118m0;
            if (f3 == null) {
                interfaceC7920f.mo13193J0(61);
            } else {
                interfaceC7920f.mo13192F0(f3.floatValue(), 61);
            }
            interfaceC7920f.mo13197h0(c1405c0.m4997g(lesson.f17120n0), 62);
            String str28 = lesson.f17122o0;
            if (str28 == null) {
                interfaceC7920f.mo13193J0(63);
            } else {
                interfaceC7920f.mo13197h0(str28, 63);
            }
            String str29 = lesson.f17124p0;
            if (str29 == null) {
                interfaceC7920f.mo13193J0(64);
            } else {
                interfaceC7920f.mo13197h0(str29, 64);
            }
            String str30 = lesson.f17126q0;
            if (str30 == null) {
                interfaceC7920f.mo13193J0(65);
            } else {
                interfaceC7920f.mo13197h0(str30, 65);
            }
            Integer numValueOf = null;
            Boolean bool = lesson.f17128r0;
            Integer numValueOf2 = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf2 == null) {
                interfaceC7920f.mo13193J0(66);
            } else {
                interfaceC7920f.mo13194W(66, numValueOf2.intValue());
            }
            interfaceC7920f.mo13192F0(lesson.f17130s0, 67);
            interfaceC7920f.mo13194W(68, lesson.f17132t0);
            String str31 = lesson.f17134u0;
            if (str31 == null) {
                interfaceC7920f.mo13193J0(69);
            } else {
                interfaceC7920f.mo13197h0(str31, 69);
            }
            Boolean bool2 = lesson.f17136v0;
            Integer numValueOf3 = bool2 == null ? null : Integer.valueOf(bool2.booleanValue() ? 1 : 0);
            if (numValueOf3 == null) {
                interfaceC7920f.mo13193J0(70);
            } else {
                interfaceC7920f.mo13194W(70, numValueOf3.intValue());
            }
            String strM4991d2 = C1405c0.m4991d(lesson.f17138w0);
            if (strM4991d2 == null) {
                interfaceC7920f.mo13193J0(71);
            } else {
                interfaceC7920f.mo13197h0(strM4991d2, 71);
            }
            Boolean bool3 = lesson.f17140x0;
            if (bool3 != null) {
                numValueOf = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
            }
            if (numValueOf == null) {
                interfaceC7920f.mo13193J0(72);
            } else {
                interfaceC7920f.mo13194W(72, numValueOf.intValue());
            }
            LessonUserLiked lessonUserLiked = lesson.f17133u;
            if (lessonUserLiked != null) {
                String str32 = lessonUserLiked.f17194a;
                if (str32 == null) {
                    interfaceC7920f.mo13193J0(73);
                } else {
                    interfaceC7920f.mo13197h0(str32, 73);
                }
                Long lM4990a = C1405c0.m4990a(lessonUserLiked.f17195b);
                if (lM4990a == null) {
                    interfaceC7920f.mo13193J0(74);
                } else {
                    interfaceC7920f.mo13194W(74, lM4990a.longValue());
                }
            } else {
                interfaceC7920f.mo13193J0(73);
                interfaceC7920f.mo13193J0(74);
            }
            LessonUserCompleted lessonUserCompleted = lesson.f17135v;
            if (lessonUserCompleted != null) {
                String str33 = lessonUserCompleted.f17188a;
                if (str33 == null) {
                    interfaceC7920f.mo13193J0(75);
                } else {
                    interfaceC7920f.mo13197h0(str33, 75);
                }
                Long lM4990a2 = C1405c0.m4990a(lessonUserCompleted.f17189b);
                if (lM4990a2 == null) {
                    interfaceC7920f.mo13193J0(76);
                } else {
                    interfaceC7920f.mo13194W(76, lM4990a2.longValue());
                }
            } else {
                interfaceC7920f.mo13193J0(75);
                interfaceC7920f.mo13193J0(76);
            }
            LessonTranslation lessonTranslation = lesson.f17137w;
            if (lessonTranslation != null) {
                String str34 = lessonTranslation.f17173a;
                if (str34 == null) {
                    interfaceC7920f.mo13193J0(77);
                } else {
                    interfaceC7920f.mo13197h0(str34, 77);
                }
                String strM4991d3 = C1405c0.m4991d(lessonTranslation.f17174b);
                if (strM4991d3 == null) {
                    interfaceC7920f.mo13193J0(78);
                } else {
                    interfaceC7920f.mo13197h0(strM4991d3, 78);
                }
            } else {
                interfaceC7920f.mo13193J0(77);
                interfaceC7920f.mo13193J0(78);
            }
            MediaSource mediaSource = lesson.f17067A;
            if (mediaSource != null) {
                String str35 = mediaSource.f17293a;
                if (str35 == null) {
                    interfaceC7920f.mo13193J0(79);
                } else {
                    interfaceC7920f.mo13197h0(str35, 79);
                }
                String str36 = mediaSource.f17294b;
                if (str36 == null) {
                    interfaceC7920f.mo13193J0(80);
                } else {
                    interfaceC7920f.mo13197h0(str36, 80);
                }
                String str37 = mediaSource.f17295c;
                if (str37 == null) {
                    interfaceC7920f.mo13193J0(81);
                } else {
                    interfaceC7920f.mo13197h0(str37, 81);
                }
            } else {
                interfaceC7920f.mo13193J0(79);
                interfaceC7920f.mo13193J0(80);
                interfaceC7920f.mo13193J0(81);
            }
            interfaceC7920f.mo13194W(82, lesson.f17093a);
        }
    }

    /* JADX INFO: renamed from: bi.p1$r */
    public class r extends AbstractC6583c {
        public r(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `SharedByUser` (`id`,`language`,`firstName`,`lastName`,`photo`,`username`,`role`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            SharedByUser sharedByUser = (SharedByUser) obj;
            interfaceC7920f.mo13194W(1, sharedByUser.f17408a);
            String str = sharedByUser.f17409b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = sharedByUser.f17410c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = sharedByUser.f17411d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = sharedByUser.f17412e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = sharedByUser.f17413f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = sharedByUser.f17414g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$r0 */
    public class r0 extends AbstractC6583c {
        public r0(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `LessonsAndCardsJoin` (`contentId`,`termWithLanguage`) VALUES (?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8799m c8799m = (C8799m) obj;
            interfaceC7920f.mo13194W(1, c8799m.f46656a);
            String str = c8799m.f46657b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$s */
    public class s extends AbstractC6583c {
        public s(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `SharedByUser` SET `id` = ?,`language` = ?,`firstName` = ?,`lastName` = ?,`photo` = ?,`username` = ?,`role` = ? WHERE `id` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            SharedByUser sharedByUser = (SharedByUser) obj;
            interfaceC7920f.mo13194W(1, sharedByUser.f17408a);
            String str = sharedByUser.f17409b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            String str2 = sharedByUser.f17410c;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13197h0(str2, 3);
            }
            String str3 = sharedByUser.f17411d;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            String str4 = sharedByUser.f17412e;
            if (str4 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str4, 5);
            }
            String str5 = sharedByUser.f17413f;
            if (str5 == null) {
                interfaceC7920f.mo13193J0(6);
            } else {
                interfaceC7920f.mo13197h0(str5, 6);
            }
            String str6 = sharedByUser.f17414g;
            if (str6 == null) {
                interfaceC7920f.mo13193J0(7);
            } else {
                interfaceC7920f.mo13197h0(str6, 7);
            }
            interfaceC7920f.mo13194W(8, sharedByUser.f17408a);
        }
    }

    /* JADX INFO: renamed from: bi.p1$s0 */
    public class s0 extends AbstractC6583c {
        public s0(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `LessonsAndCardsJoin` SET `contentId` = ?,`termWithLanguage` = ? WHERE `contentId` = ? AND `termWithLanguage` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            C8799m c8799m = (C8799m) obj;
            interfaceC7920f.mo13194W(1, c8799m.f46656a);
            String str = c8799m.f46657b;
            if (str == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str, 2);
            }
            interfaceC7920f.mo13194W(3, c8799m.f46656a);
            if (str == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str, 4);
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$t */
    public class t extends AbstractC6583c {
        public t(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "INSERT INTO `SharedByUserAndQueryJoin` (`language`,`query`,`userId`) VALUES (?,?,?)";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            SharedByUserAndQueryJoin sharedByUserAndQueryJoin = (SharedByUserAndQueryJoin) obj;
            String str = sharedByUserAndQueryJoin.f17415a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = sharedByUserAndQueryJoin.f17416b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            interfaceC7920f.mo13194W(3, sharedByUserAndQueryJoin.f17417c);
        }
    }

    /* JADX INFO: renamed from: bi.p1$u */
    public class u extends AbstractC6583c {
        public u(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE `SharedByUserAndQueryJoin` SET `language` = ?,`query` = ?,`userId` = ? WHERE `language` = ? AND `query` = ? AND `userId` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            SharedByUserAndQueryJoin sharedByUserAndQueryJoin = (SharedByUserAndQueryJoin) obj;
            String str = sharedByUserAndQueryJoin.f17415a;
            if (str == null) {
                interfaceC7920f.mo13193J0(1);
            } else {
                interfaceC7920f.mo13197h0(str, 1);
            }
            String str2 = sharedByUserAndQueryJoin.f17416b;
            if (str2 == null) {
                interfaceC7920f.mo13193J0(2);
            } else {
                interfaceC7920f.mo13197h0(str2, 2);
            }
            long j10 = sharedByUserAndQueryJoin.f17417c;
            interfaceC7920f.mo13194W(3, j10);
            String str3 = sharedByUserAndQueryJoin.f17415a;
            if (str3 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13197h0(str3, 4);
            }
            if (str2 == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str2, 5);
            }
            interfaceC7920f.mo13194W(6, j10);
        }
    }

    /* JADX INFO: renamed from: bi.p1$v */
    public class v extends AbstractC6583c {
        public v(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "UPDATE OR ABORT `TranslationSentence` SET `index` = ?,`lessonId` = ?,`audio` = ?,`audioEnd` = ?,`text` = ?,`translations` = ? WHERE `index` = ? AND `lessonId` = ?";
        }

        @Override // p213k4.AbstractC6583c
        /* JADX INFO: renamed from: d */
        public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
            TranslationSentence translationSentence = (TranslationSentence) obj;
            interfaceC7920f.mo13194W(1, translationSentence.f17533a);
            long j10 = translationSentence.f17534b;
            interfaceC7920f.mo13194W(2, j10);
            Double d10 = translationSentence.f17535c;
            if (d10 == null) {
                interfaceC7920f.mo13193J0(3);
            } else {
                interfaceC7920f.mo13192F0(d10.doubleValue(), 3);
            }
            Double d11 = translationSentence.f17536d;
            if (d11 == null) {
                interfaceC7920f.mo13193J0(4);
            } else {
                interfaceC7920f.mo13192F0(d11.doubleValue(), 4);
            }
            String str = translationSentence.f17537e;
            if (str == null) {
                interfaceC7920f.mo13193J0(5);
            } else {
                interfaceC7920f.mo13197h0(str, 5);
            }
            interfaceC7920f.mo13197h0(C1502p1.this.f8727c.m5013x(translationSentence.f17538f), 6);
            interfaceC7920f.mo13194W(7, translationSentence.f17533a);
            interfaceC7920f.mo13194W(8, j10);
        }
    }

    /* JADX INFO: renamed from: bi.p1$w */
    public class w implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8772a;

        public w(List list) {
            this.f8772a = list;
        }

        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            roomDatabase.m4552c();
            try {
                c1502p1.f8729e.m1226n(this.f8772a);
                roomDatabase.m4568s();
                return C9072e.f47360a;
            } finally {
                roomDatabase.m4563n();
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$x */
    public class x extends SharedSQLiteStatement {
        public x(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        /* JADX INFO: renamed from: b */
        public final String mo4575b() {
            return "DELETE FROM Lesson WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: bi.p1$y */
    public class y implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonBookmark f8774a;

        public y(LessonBookmark lessonBookmark) {
            this.f8774a = lessonBookmark;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            RoomDatabase roomDatabase2 = c1502p1.f8725a;
            roomDatabase.m4552c();
            try {
                c1502p1.f8731g.m1225m(this.f8774a);
                roomDatabase2.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase2.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase2.m4563n();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: bi.p1$z */
    public class z implements Callable<C9072e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8776a;

        public z(List list) {
            this.f8776a = list;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final C9072e call() throws Exception {
            C1502p1 c1502p1 = C1502p1.this;
            RoomDatabase roomDatabase = c1502p1.f8725a;
            roomDatabase.m4552c();
            try {
                c1502p1.f8733i.m1226n(this.f8776a);
                roomDatabase.m4568s();
                C9072e c9072e = C9072e.f47360a;
                roomDatabase.m4563n();
                return c9072e;
            } catch (Throwable th2) {
                roomDatabase.m4563n();
                throw th2;
            }
        }
    }

    public C1502p1(RoomDatabase roomDatabase) {
        this.f8725a = roomDatabase;
        new k(roomDatabase);
        this.f8726b = new v(roomDatabase);
        new x(roomDatabase);
        new d0(roomDatabase);
        new j0(roomDatabase);
        this.f8728d = new C0322j(new o0(roomDatabase), new q0(roomDatabase));
        this.f8729e = new C0322j(new r0(roomDatabase), new s0(roomDatabase));
        this.f8730f = new C0322j(new a(roomDatabase), new b(roomDatabase));
        new c(roomDatabase);
        new d(roomDatabase);
        this.f8731g = new C0322j(new e(roomDatabase), new f(roomDatabase));
        this.f8732h = new C0322j(new g(roomDatabase), new h(roomDatabase));
        this.f8733i = new C0322j(new i(roomDatabase), new j(roomDatabase));
        this.f8734j = new C0322j(new l(roomDatabase), new m(roomDatabase));
        new n(roomDatabase);
        new o(roomDatabase);
        this.f8735k = new C0322j(new p(roomDatabase), new q(roomDatabase));
        this.f8736l = new C0322j(new r(roomDatabase), new s(roomDatabase));
        this.f8724H = new C0322j(new t(roomDatabase), new u(roomDatabase));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: A0 */
    public final C7136q mo5128A0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM TranslationSentence WHERE lessonId = ? ORDER BY TranslationSentence.`index`", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8725a, true, new String[]{"TranslationSentence"}, new CallableC1391a2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: B0 */
    public final Object mo5129B0(int i10, int i11, int i12, InterfaceC9968c<? super List<LessonStudyTranslationSentence>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM TranslationSentence WHERE lessonId = ? AND (`index` = ? OR `index` = ?)", 3);
        c6595oM13191l.mo13194W(1, i10);
        c6595oM13191l.mo13194W(2, i11);
        return C1185b.m4581c(this.f8725a, false, C0141b.m610f(c6595oM13191l, 3, i12), new n0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: C0 */
    public final Object mo5130C0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new CallableC1537u1(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: D0 */
    public final Object mo5131D0(LessonBookmark lessonBookmark, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new y(lessonBookmark), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: E0 */
    public final Object mo5132E0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new CallableC1544v1(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: F0 */
    public final Object mo5133F0(List<SharedByUser> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new c0(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: G0 */
    public final Object mo5134G0(List<Sentence> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new b0(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: H0 */
    public final Object mo5135H0(List<C8799m> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new a0(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: I0 */
    public final Object mo5136I0(List<C8799m> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new w(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: J0 */
    public final Object mo5137J0(List<C8801o> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new z(list), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: K0 */
    public final Object mo5138K0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new CallableC1523s1(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: L0 */
    public final Object mo5139L0(List list, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8725a, new CallableC1530t1(this, list), continuationImpl);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: M0 */
    public final C7136q mo5140M0(String str, int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT COUNT(*) FROM LessonAudioDownload WHERE language = ? AND id = ? AND isDownloaded = 1", 2);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        c6595oM13191l.mo13194W(2, i10);
        return C1185b.m4579a(this.f8725a, false, new String[]{"LessonAudioDownload"}, new CallableC1415d2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: N0 */
    public final C7136q mo5141N0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT contentId FROM LessonsAndWordsJoin WHERE contentId = ? LIMIT 1", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8725a, false, new String[]{"LessonsAndWordsJoin"}, new CallableC1423e2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: O0 */
    public final Object mo5142O0(ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new CallableC1447h2(this, arrayList), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: P0 */
    public final Object mo5143P0(TranslationSentence translationSentence, ContinuationImpl continuationImpl) {
        return C1185b.m4580b(this.f8725a, new CallableC1509q1(this, translationSentence), continuationImpl);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: Q0 */
    public final Object mo5144Q0(List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new p0(list), interfaceC9968c);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h0 */
    public final Object mo598h0(Object obj, InterfaceC9968c interfaceC9968c) {
        return C1185b.m4580b(this.f8725a, new CallableC1516r1(this, (Lesson) obj), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: k0 */
    public final C7136q mo5145k0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `url`, `title`, `description`, `imageUrl`, `audioUrl`, `duration`, `status`, `originalUrl`, `wordCount`, `uniqueWordCount`, `rosesCount`, `collectionId`, `collectionTitle`, `previousLessonId`, `nextLessonId`, `isCompleted`, `newWordsCount`, `cardsCount`, `isRoseGiven`, `giveRoseUrl`, `price`, `videoUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `isSharedByIsFriend`, `level`, `tags`, `mediaImageUrl`, `mediaTitle`, `newWords`, `lessonPreview`, `source_type`, `source_name`, `source_url` FROM (SELECT * FROM Lesson WHERE id = ?)", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8725a, false, new String[]{"Lesson"}, new CallableC1558x1(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: l0 */
    public final C7136q mo5146l0(String str, String str2) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `photo`, `username`, `role` FROM (\n    SELECT DISTINCT * FROM SharedByUser \n    WHERE id IN (\n        SELECT userId FROM SharedByUserAndQueryJoin WHERE `query` = ? AND language = ?\n    ) \n    LIMIT ?\n  )", 3);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        if (str2 == null) {
            c6595oM13191l.mo13193J0(2);
        } else {
            c6595oM13191l.mo13197h0(str2, 2);
        }
        c6595oM13191l.mo13194W(3, 25);
        return C1185b.m4579a(this.f8725a, true, new String[]{"SharedByUser", "SharedByUserAndQueryJoin"}, new CallableC1439g2(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: m0 */
    public final Object mo5147m0(int i10, String str, InterfaceC9968c<? super LessonStudySentence> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph` FROM (SELECT * FROM sentence WHERE lessonId = ? AND normalizedText LIKE '%' ||? || '%' ORDER BY `index` LIMIT 1)", 2);
        c6595oM13191l.mo13194W(1, i10);
        c6595oM13191l.mo13197h0(str, 2);
        return C1185b.m4581c(this.f8725a, false, new CancellationSignal(), new l0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: n0 */
    public final Object mo5148n0(String str, InterfaceC9968c<? super LessonStudySentence> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph` FROM (SELECT * FROM sentence WHERE normalizedText LIKE '%' ||? || '%' ORDER BY `index` LIMIT 1)", 1);
        c6595oM13191l.mo13197h0(str, 1);
        return C1185b.m4581c(this.f8725a, false, new CancellationSignal(), new m0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: o0 */
    public final Object mo5149o0(int i10, InterfaceC9968c<? super Lesson> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM Lesson WHERE id = ?", 1);
        return C1185b.m4581c(this.f8725a, false, C0141b.m610f(c6595oM13191l, 1, i10), new e0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: p0 */
    public final Object mo5150p0(int i10, InterfaceC9968c<? super LessonStudyBookmark> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `wordIndex`, `client`, `timestamp`, `languageTimestamp` FROM (SELECT DISTINCT * FROM LessonBookmark WHERE contentId = ?)", 1);
        return C1185b.m4581c(this.f8725a, false, C0141b.m610f(c6595oM13191l, 1, i10), new h0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: q0 */
    public final Object mo5151q0(int i10, InterfaceC9968c<? super LessonInfo> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `url`, `title`, `description`, `imageUrl`, `audioUrl`, `duration`, `status`, `originalUrl`, `wordCount`, `uniqueWordCount`, `rosesCount`, `collectionId`, `collectionTitle`, `previousLessonId`, `nextLessonId`, `isCompleted`, `newWordsCount`, `cardsCount`, `isRoseGiven`, `giveRoseUrl`, `price`, `videoUrl`, `providerId`, `providerName`, `providerDescription`, `originalImageUrl`, `providerImageUrl`, `sharedById`, `sharedByName`, `sharedByImageUrl`, `sharedByRole`, `isSharedByIsFriend`, `level`, `tags`, `mediaImageUrl`, `mediaTitle`, `newWords`, `lessonPreview`, `source_type`, `source_name`, `source_url` FROM (SELECT * FROM Lesson WHERE id = ?)", 1);
        return C1185b.m4581c(this.f8725a, false, C0141b.m610f(c6595oM13191l, 1, i10), new g0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: r0 */
    public final C7136q mo5152r0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `imageUrl`, `audioUrl`, `collectionTitle`, `videoUrl` FROM (SELECT * FROM Lesson WHERE id = ?)", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8725a, false, new String[]{"Lesson"}, new CallableC1551w1(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: s0 */
    public final C7136q mo5153s0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT lessonPreview FROM Lesson WHERE id = ?", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8725a, false, new String[]{"Lesson"}, new CallableC1565y1(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: t0 */
    public final Object mo5154t0(int i10, int i11, ContinuationImpl continuationImpl) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM TranslationSentence WHERE lessonId = ? AND `index` = ?", 2);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4581c(this.f8725a, false, C0141b.m610f(c6595oM13191l, 2, i11), new CallableC1407c2(this, c6595oM13191l), continuationImpl);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: u0 */
    public final Object mo5155u0(int i10, int i11, InterfaceC9968c<? super LessonStudySentence> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph` FROM (SELECT * FROM Sentence WHERE lessonId = ? AND `index` = ?)", 2);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4581c(this.f8725a, true, C0141b.m610f(c6595oM13191l, 2, i11), new k0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: v0 */
    public final Object mo5156v0(int i10, InterfaceC9968c<? super List<LessonStudySentence>> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph` FROM (SELECT * FROM Sentence WHERE lessonId = ?)", 1);
        return C1185b.m4581c(this.f8725a, true, C0141b.m610f(c6595oM13191l, 1, i10), new i0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: w0 */
    public final Object mo5157w0(int i10, InterfaceC9968c<? super LessonStudy> interfaceC9968c) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `title`, `description`, `imageUrl`, `audioUrl`, `duration`, `collectionId`, `collectionTitle`, `previousLessonId`, `nextLessonId`, `isCompleted`, `newWordsCount`, `price`, `videoUrl`, `originalImageUrl`, `sharedByName`, `canEditSentence`, `isProtected`, `level`, `progressDownloaded`, `translationSentence`, `mediaImageUrl`, `mediaTitle`, `isTaken`, `audioPending` FROM (SELECT * FROM Lesson WHERE id = ?)", 1);
        return C1185b.m4581c(this.f8725a, false, C0141b.m610f(c6595oM13191l, 1, i10), new f0(c6595oM13191l), interfaceC9968c);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: x0 */
    public final C7136q mo5158x0(String str) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT DISTINCT * FROM LessonTag WHERE title LIKE ? || '%' ORDER BY title", 1);
        if (str == null) {
            c6595oM13191l.mo13193J0(1);
        } else {
            c6595oM13191l.mo13197h0(str, 1);
        }
        CallableC1431f2 callableC1431f2 = new CallableC1431f2(this, c6595oM13191l);
        return C1185b.m4579a(this.f8725a, true, new String[]{"LessonTag"}, callableC1431f2);
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: y0 */
    public final C7136q mo5159y0(int i10) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT `id`, `url`, `audioUrl`, `status`, `collectionId`, `collectionTitle`, `nextLessonId`, `readTimes`, `listenTimes`, `isRoseGiven`, `price`, `isFavorite`, `originalImageUrl` FROM (SELECT * FROM Lesson WHERE id = ?)", 1);
        c6595oM13191l.mo13194W(1, i10);
        return C1185b.m4579a(this.f8725a, false, new String[]{"Lesson"}, new CallableC1572z1(this, c6595oM13191l));
    }

    @Override // bi.AbstractC1495o1
    /* JADX INFO: renamed from: z0 */
    public final C7136q mo5160z0(int i10, int i11) {
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM TranslationSentence WHERE lessonId = ? AND `index` = ?", 2);
        c6595oM13191l.mo13194W(1, i10);
        c6595oM13191l.mo13194W(2, i11);
        return C1185b.m4579a(this.f8725a, true, new String[]{"TranslationSentence"}, new CallableC1399b2(this, c6595oM13191l));
    }
}
