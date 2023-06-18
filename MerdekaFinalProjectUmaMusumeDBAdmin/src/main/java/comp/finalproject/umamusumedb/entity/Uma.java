package comp.finalproject.umamusumedb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uma")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Uma {

    @Id
    private Long gametora_id;

    private String uma_name;
    private Byte star;
    private String is_alter;
    private String alter_theme;
    private String release_date;
    private Short height;
    private Short three_size_bust;
    private Short three_size_waist;
    private Short three_size_hips;
    private Character surface_turf;
    private Character surface_dirt;
    private Character distance_short;
    private Character distance_mile;
    private Character distance_medium;
    private Character distance_long;
    private Character strategy_runner;
    private Character strategy_leader;
    private Character strategy_betweener;
    private Character strategy_chaser;
    private Short initial_base_stats_speed;
    private Short initial_base_stats_stamina;
    private Short initial_base_stats_power;
    private Short initial_base_stats_guts;
    private Short initial_base_stats_wisdom;
    private Short upgraded_base_stats_speed;
    private Short upgraded_base_stats_stamina;
    private Short upgraded_base_stats_power;
    private Short upgraded_base_stats_guts;
    private Short upgraded_base_stats_wisdom;
    private Double stat_bonuses_speed;
    private Double stat_bonuses_stamina;
    private Double stat_bonuses_power;
    private Double stat_bonuses_guts;
    private Double stat_bonuses_wisdom;

}
